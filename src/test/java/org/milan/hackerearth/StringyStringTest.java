package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link StringyString}
 *
 * @author Milan Rathod
 */
class StringyStringTest {

    @Test
    void testInvalidString() {
        StringyString stringyString = new StringyString();

        String result = stringyString.invalidString(List.of("chakshu", "pekka", "punk", "golem", "tyagi"));

        assertEquals("pekka", result);

        result = stringyString.invalidString(List.of("oc", "cgmug", "gs", "qmqbm", "rcv", "hetl", "a", "gafs", "s"));

        assertEquals("a", result);

        result = stringyString.invalidString(List.of("abc", "xyz", "cde"));

        assertEquals("xyz", result);
    }
}