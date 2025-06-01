package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/combination-sum/">...</a>}
 *
 * @author Milan Rathod
 */
public class CombinationSum {

    /**
     * Finds all unique combinations of numbers from the given array `candidates` that sum up to a target value.
     * Each number in `candidates` may be used an unlimited number of times in the combination.
     *
     * @param candidates an array of integers representing the candidate numbers
     * @param target the target sum for which combinations need to be found
     * @return a list of lists, where each inner list is a unique combination of numbers from `candidates` that add up to `target`
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> response = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        recursion(candidates, target, 0, currentList, response);

        return response;
    }

    private void recursion(int[] candidates, int target, int start, List<Integer> currentList, List<List<Integer>> response) {
        if (target == 0) {
            response.add(new ArrayList<>(currentList));
            return;
        }

        if (target < 0 || start >= candidates.length) {
            return;
        }

        currentList.add(candidates[start]);

        recursion(candidates, target - candidates[start], start, currentList, response);

        currentList.removeLast();

        recursion(candidates, target, start + 1, currentList, response);
    }
}
