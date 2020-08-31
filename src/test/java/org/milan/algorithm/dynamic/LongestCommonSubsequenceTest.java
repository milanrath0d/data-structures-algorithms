package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestCommonSubsequence}
 *
 * @author Milan Rathod
 */
class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    private String s1 = "AGGTAB";

    private String s2 = "GXTXAYB";

    @BeforeEach
    void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    void testLcsByRecursion() {
        int result = longestCommonSubsequence.lcsByRecursion(s1, s2);

        assertEquals(4, result);
    }

    @Test
    void testLcsByDynamic() {
        int result = longestCommonSubsequence.lcsByDynamic(s1, s2);

        assertEquals(4, result);
    }

    @Test
    void testFindLcs() {
        String result = longestCommonSubsequence.findLcs(s1, s2);

        assertEquals("GTAB", result);
    }

}