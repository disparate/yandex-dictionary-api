package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class Synonym {

    @JsonProperty("text")
    private String text;

    @JsonProperty("pos")
    private String partOfSpeech;

    @JsonProperty("gen")
    private String gender;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(final String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }
}
