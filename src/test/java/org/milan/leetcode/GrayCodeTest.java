package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link GrayCode}
 *
 * @author Milan Rathod
 */
class GrayCodeTest {

    @Test
    void grayCode() {
        GrayCode grayCode = new GrayCode();

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1, 3, 2), grayCode.grayCode(2)));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1), grayCode.grayCode(1)));
    }

    @Test
    void grayCodeV2() {
        GrayCode grayCode = new GrayCode();

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1, 3, 2), grayCode.grayCodeV2(2)));

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1), grayCode.grayCodeV2(1)));
    }
}