package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class Translation {

    @JsonProperty("text")
    private String text;

    @JsonProperty("pos")
    private String partOfSpeech;

    @JsonProperty("asp")
    private String aspect;

    @JsonProperty("gen")
    private String gender;

    @JsonProperty("syn")
    private List<Synonym> synonymList;

    @JsonProperty("mean")
    private List<Mean> meanList;

    @JsonProperty("ex")
    private List<Example> exampleList;

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

    public String getAspect() {
        return aspect;
    }

    public void setAspect(final String aspect) {
        this.aspect = aspect;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public List<Synonym> getSynonymList() {
        return synonymList;
    }

    public void setSynonymList(final List<Synonym> synonymList) {
        this.synonymList = synonymList;
    }

    public List<Mean> getMeanList() {
        return meanList;
    }

    public void setMeanList(final List<Mean> meanList) {
        this.meanList = meanList;
    }

    public List<Example> getExampleList() {
        return exampleList;
    }

    public void setExampleList(final List<Example> exampleList) {
        this.exampleList = exampleList;
    }
}
