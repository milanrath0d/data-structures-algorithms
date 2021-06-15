package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Substrings}
 *
 * @author Milan Rathod
 */
class SubstringsTest {

    @Test
    void findAll() {
        Substrings substrings = new Substrings();

        List<String> result = substrings.findAll("ABCD");

        assertEquals(10, result.size());
    }
}