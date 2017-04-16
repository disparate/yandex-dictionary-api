package com.github.shefferite.client.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.shefferite.client.RestClient;
import com.github.shefferite.model.DictionaryResponse;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.HttpClients;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class RestClientImpl implements RestClient {

    private static final String SERVICE_URL = "https://dictionary.yandex.net/api/v1/dicservice.json/";
    private static final int DEFAULT_TIMEOUT = 30000;

    private static final String KEY_PARAM = "key";

    private String applicationKey;

    public RestClientImpl(final String key) {
        this.applicationKey = key;
        initHttpClient();
    }

    private void initHttpClient() {
        try {
            final HttpClient httpClient = createHttpClient();
            Unirest.setHttpClient(httpClient);
        } catch (final Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public DictionaryResponse call(final String method, final Map<String, Object> parameters) {
        try {
            final String url = getServiceUrl(method);
            final HttpResponse<String> response = Unirest.post(url)
                    .fields(getParams(parameters))
                    .asString();
            final String body = response.getBody();
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(body, DictionaryResponse.class);
        } catch (final Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private HttpClient createHttpClient() throws Exception {
        final SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(
                SSLContexts.custom()
                        .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                        .build()
        );

        final RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(DEFAULT_TIMEOUT)
                .setConnectTimeout(DEFAULT_TIMEOUT)
                .setConnectionRequestTimeout(DEFAULT_TIMEOUT)
                .setRedirectsEnabled(true)
                .build();

        return HttpClients.custom()
                .setSSLSocketFactory(socketFactory)
                .setDefaultRequestConfig(requestConfig)
                .build();
    }

    private String getServiceUrl(final String method) {
        return SERVICE_URL + method;
    }

    private Map<String, Object> getParams(final Map<String, Object> params) {
        final Map<String, Object> requestParams = Optional.ofNullable(params)
                .orElse(new HashMap<>());
        requestParams.putIfAbsent(KEY_PARAM, applicationKey);
        return requestParams;
    }
}
