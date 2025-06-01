package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link CombinationSum}
 *
 * @author Milan Rathod
 */
class CombinationSumTest {

    @Test
    void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();

        // Test case 1: Example 1 from LeetCode
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> result1 = combinationSum.combinationSum(candidates1, target1);
        
        assertEquals(2, result1.size());
        assertTrue(result1.contains(Arrays.asList(2, 2, 3)));
        assertTrue(result1.contains(Arrays.asList(7)));

        // Test case 2: Example 2 from LeetCode
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        List<List<Integer>> result2 = combinationSum.combinationSum(candidates2, target2);
        
        assertEquals(3, result2.size());
        assertTrue(result2.contains(Arrays.asList(2, 2, 2, 2)));
        assertTrue(result2.contains(Arrays.asList(2, 3, 3)));
        assertTrue(result2.contains(Arrays.asList(3, 5)));

        // Test case 3: No solution
        int[] candidates3 = {2};
        int target3 = 1;
        List<List<Integer>> result3 = combinationSum.combinationSum(candidates3, target3);
        
        assertTrue(result3.isEmpty());

        // Test case 4: Target is one of the candidates
        int[] candidates4 = {5, 10, 15};
        int target4 = 15;
        List<List<Integer>> result4 = combinationSum.combinationSum(candidates4, target4);
        
        assertEquals(3, result4.size());
        assertTrue(result4.contains(Arrays.asList(5, 5, 5)));
        assertTrue(result4.contains(Arrays.asList(5, 10)));
        assertTrue(result4.contains(Arrays.asList(15)));
    }
}
