package com.github.shefferite.client.parameters;

import com.github.shefferite.model.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serg Petrochenko
 *         18/03/2017.
 */
public final class ParametersBuilder {

    private static final String DASH = "-";

    private static final String LANG_PARAM = "lang";
    private static final String TEXT = "text";

    final Map<String, Object> parameters;

    private ParametersBuilder() {
        parameters = new HashMap<>();
    }

    public static ParametersBuilder create() {
        return new ParametersBuilder();
    }

    public ParametersBuilder withLang(final Direction direction) {
        parameters.put(LANG_PARAM, direction.getSource().getCode() + DASH + direction.getTarget().getCode());
        return this;
    }

    public ParametersBuilder withText(final String text) {
        parameters.put(TEXT, text);
        return this;
    }

    public Map<String, Object> build() {
        return parameters;
    }
}
