package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MapSumPairs}
 *
 * @author Milan Rathod
 */
class MapSumPairsTest {

    @Test
    void testOperations() {
        MapSumPairs mapSumPairs = new MapSumPairs();

        mapSumPairs.insert("apple", 3);

        assertEquals(3, mapSumPairs.sum("ap"));

        mapSumPairs.insert("app", 2);

        assertEquals(5, mapSumPairs.sum("ap"));
    }

}