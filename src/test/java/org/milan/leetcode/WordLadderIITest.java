package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link WordLadderII}
 *
 * @author Milan Rathod
 */
class WordLadderIITest {

    @Test
    void findLadders() {
        WordLadderII wordLadderII = new WordLadderII();

        List<List<String>> result = wordLadderII
                .findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"));
        assertEquals(2, result.size());

        assertTrue(ListUtil.isEqual(Arrays.asList("hit", "hot", "dot", "dog", "cog"), result.get(0)));

        assertTrue(ListUtil.isEqual(Arrays.asList("hit", "hot", "lot", "log", "cog"), result.get(1)));

        result = wordLadderII
                .findLadders("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"));

        assertEquals(0, result.size());
    }
}