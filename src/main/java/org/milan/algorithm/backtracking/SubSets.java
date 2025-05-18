package org.milan.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/subsets/">...</a>}
 *
 * @author Milan Rathod
 */
public class SubSets {

  /**
   * Generates all possible subsets of the given array of integers.
   * This method uses backtracking to systematically explore all combinations.
   * Note: All numbers in the input array are unique.
   *
   * @param nums the input array of integers with unique values
   * @return a list containing all possible subsets of the input array
   */
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    explore(nums, 0, subset, result);

    return result;
  }

  /**
   * Recursive backtracking method to explore all possible subsets
   *
   * @param nums   the input array of integers
   * @param i      the current index to start exploration from
   * @param subset the current subset being built
   * @param result the list to store all generated subsets
   */
  private void explore(int[] nums, int i, List<Integer> subset, List<List<Integer>> result) {
    // Add current subset to result
    result.add(new ArrayList<>(subset));

    // Explore further
    for (int j = i; j < nums.length; j++) {
      subset.add(nums[j]);
      explore(nums, j + 1, subset, result);
      subset.removeLast();
    }
  }
}
