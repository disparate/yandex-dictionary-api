package com.github.shefferite.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
@JsonIgnoreProperties({"head"})
public class DictionaryResponse {

    @JsonProperty("def")
    private List<Definition> definitions;

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(final List<Definition> definitions) {
        this.definitions = definitions;
    }
}