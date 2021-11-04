package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DecodeWaysII}
 *
 * @author Milan Rathod
 */
class DecodeWaysIITest {

    @Test
    void find() {
        DecodeWaysII decodeWaysII = new DecodeWaysII();

        assertEquals(9, decodeWaysII.find("*"));

        assertEquals(18, decodeWaysII.find("1*"));

        assertEquals(15, decodeWaysII.find("2*"));
    }
}