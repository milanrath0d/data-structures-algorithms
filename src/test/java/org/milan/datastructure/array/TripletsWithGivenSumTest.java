package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class {@link TripletsWithGivenSum}
 *
 * @author Milan Rathod
 */
class TripletsWithGivenSumTest {

    @Test
    void find() {
        int[] arr = {-2, 0, 0, 2, 2};

        TripletsWithGivenSum tripletsWithGivenSum = new TripletsWithGivenSum();

        List<List<Integer>> result = tripletsWithGivenSum.find(arr, 0);

        assertTrue(ListUtil.isEqual(Arrays.asList(-2, 0, 2), new ArrayList<>(result.get(0))));

        arr = new int[]{-1, 0, 1, 2, -1, -4};

        result = tripletsWithGivenSum.find(arr, 0);

        assertTrue(ListUtil.isEqual(Arrays.asList(-1, -1, 2), new ArrayList<>(result.get(0))));

        assertTrue(ListUtil.isEqual(Arrays.asList(-1, 0, 1), new ArrayList<>(result.get(1))));
    }

}