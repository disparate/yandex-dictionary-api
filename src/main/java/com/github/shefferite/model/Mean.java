package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class Mean {

    @JsonProperty("text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
