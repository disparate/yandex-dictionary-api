package com.github.shefferite.client;

import com.github.shefferite.model.DictionaryResponse;

import java.util.Map;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public interface RestClient {

    DictionaryResponse call(String method, Map<String, Object> params);
}
