package com.github.shefferite.service.impl;

import com.github.shefferite.client.RestClient;
import com.github.shefferite.client.impl.RestClientImpl;
import com.github.shefferite.client.parameters.ParametersBuilder;
import com.github.shefferite.model.DictionaryResponse;
import com.github.shefferite.model.Direction;
import com.github.shefferite.service.YDictionaryService;

import java.util.Map;

/**
 * @author Serg Petrochenko
 *         18/03/2017.
 */
public class YDictionaryServiceImpl implements YDictionaryService {

    private static final String LOOKUP_METHOD = "lookup";

    private RestClient restClient;

    public YDictionaryServiceImpl(final String key) {
        restClient = new RestClientImpl(key);
    }

    @Override
    public DictionaryResponse lookup(final String text, final Direction direction) {
        final Map<String, Object> parameters = ParametersBuilder.create()
                .withLang(direction)
                .withText(text)
                .build();
        return restClient.call(LOOKUP_METHOD, parameters);
    }
}
