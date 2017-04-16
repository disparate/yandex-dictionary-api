package com.github.shefferite.model;

/**
 * @author Serg Petrochenko
 *         18/03/2017.
 */
public enum Language {
    EN("en"), RU("ru"), DE("de");

    private String code;

    Language(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
