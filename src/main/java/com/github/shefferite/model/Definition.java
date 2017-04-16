package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class Definition {

    @JsonProperty("text")
    private String text;

    @JsonProperty("pos")
    private String partOfSpeech;

    @JsonProperty("ts")
    private String transcription;

    @JsonProperty("gen")
    private String gender;

    @JsonProperty("tr")
    private List<Translation> translationList;

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

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(final String transcription) {
        this.transcription = transcription;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public List<Translation> getTranslationList() {
        return translationList;
    }

    public void setTranslationList(final List<Translation> translationList) {
        this.translationList = translationList;
    }
}
