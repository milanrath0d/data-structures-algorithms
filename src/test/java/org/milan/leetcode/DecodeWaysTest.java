package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DecodeWays}
 *
 * @author Milan Rathod
 */
class DecodeWaysTest {

    @Test
    void find() {
        DecodeWays decodeWays = new DecodeWays();

        assertEquals(2, decodeWays.find("12"));

        assertEquals(3, decodeWays.find("226"));

        assertEquals(0, decodeWays.find("0"));

        assertEquals(0, decodeWays.find("06"));
    }
}