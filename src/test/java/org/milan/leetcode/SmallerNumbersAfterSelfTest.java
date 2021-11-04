package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SmallerNumbersAfterSelf}
 *
 * @author Milan Rathod
 */
class SmallerNumbersAfterSelfTest {

    @Test
    void countSmaller() {
        SmallerNumbersAfterSelf smallerNumbersAfterSelf = new SmallerNumbersAfterSelf();

        assertTrue(ListUtil.isEqual(Arrays.asList(2, 1, 1, 0), smallerNumbersAfterSelf.countSmaller(
            new int[]{5, 2, 6, 1}
        )));

        assertTrue(ListUtil.isEqual(Collections.singletonList(0), smallerNumbersAfterSelf.countSmaller(
            new int[]{-1}
        )));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 0), smallerNumbersAfterSelf.countSmaller(
            new int[]{-1, -1}
        )));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1, 0), smallerNumbersAfterSelf.countSmaller(
            new int[]{0, 2, 1}
        )));
    }
}