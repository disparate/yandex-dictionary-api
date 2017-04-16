package com.github.shefferite.service;

import com.github.shefferite.model.DictionaryResponse;
import com.github.shefferite.model.Direction;

/**
 * @author Serg Petrochenko
 *         18/03/2017.
 */
public interface YDictionaryService {

    DictionaryResponse lookup(final String text, final Direction direction);
}
