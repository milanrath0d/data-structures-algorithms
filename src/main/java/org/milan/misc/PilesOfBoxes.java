package org.milan.misc;

import org.milan.util.ArrayUtil;

/**
 * Problem: You are given an array of heights of pile of boxes.
 * You have to return the number of steps required to bring
 * the height of entire pile to the same height as pile with minimum height.
 * In one step, you can lower the tallest pile only to the next taller pile.
 * You can adjust only one pile in a step even though 2 piles could be of same height.
 *
 * @author Milan Rathod
 */
public class PilesOfBoxes {

    public int minimumSteps(int[] heights) {

        ArrayUtil.reverseSort(heights);

        int n = heights.length;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int curr = heights[i];
            int next = heights[i + 1];
            if (curr > next) {
                count += i + 1;
            }
        }

        return count;
    }
}
