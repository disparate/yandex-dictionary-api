package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class Example {

    @JsonProperty("text")
    private String text;

    @JsonProperty("tr")
    private List<ExampleTranslation> exampleTranslationList;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public List<ExampleTranslation> getExampleTranslationList() {
        return exampleTranslationList;
    }

    public void setExampleTranslationList(final List<ExampleTranslation> exampleTranslationList) {
        this.exampleTranslationList = exampleTranslationList;
    }
}
