package com.github.shefferite.client.impl;

import com.github.shefferite.model.Direction;
import com.github.shefferite.model.Language;
import com.github.shefferite.service.YDictionaryService;
import com.github.shefferite.service.impl.YDictionaryServiceImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author Serg Petrochenko
 *         09/07/16.
 */
public class RestClientImplTest {

    @Test
    public void test() {
        YDictionaryService service = new YDictionaryServiceImpl("dict.1.1.20160709T070521Z.f6adbfd7915e5e2d.64e8423880abfbc7721f8b280d6d02c2886a3879");
        final Direction direction = new Direction();
        direction.setSource(Language.RU);
        direction.setTarget(Language.DE);
        service.lookup("огонь", direction);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put("lang", "en-ru");
        parameters.put("text", "time");

        RestClientImpl restClient = new RestClientImpl("dict.1.1.20160709T070521Z.f6adbfd7915e5e2d.64e8423880abfbc7721f8b280d6d02c2886a3879");

        restClient.call("lookup", parameters);
    }
}