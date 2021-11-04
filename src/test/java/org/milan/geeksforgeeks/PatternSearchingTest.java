package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link PatternSearching}
 *
 * @author Milan Rathod
 */
class PatternSearchingTest {

    @Test
    void search() {
        PatternSearching patternSearching = new PatternSearching();

        assertTrue(ListUtil.isEqual(Arrays.asList(10),
            patternSearching.search("THIS IS A TEST TEXT", "TEST")));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 9, 12),
            patternSearching.search("AABAACAADAABAABA", "AABA")));
    }

    @Test
    @Disabled
    void searchV2() {
        PatternSearching patternSearching = new PatternSearching();

        assertTrue(ListUtil.isEqual(Arrays.asList(10),
            patternSearching.searchV2("THIS IS A TEST TEXT", "TEST")));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 9, 12),
            patternSearching.searchV2("AABAACAADAABAABA", "AABA")));
    }
}