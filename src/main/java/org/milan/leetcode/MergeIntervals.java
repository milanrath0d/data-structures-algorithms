package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

/**
 * Refer {@link @https://leetcode.com/problems/merge-intervals/}
 *
 * @author Milan Rathod
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Interval[] intervalArr = new Interval[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            intervalArr[i] = new Interval(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(intervalArr, Comparator.comparingInt(o -> o.start));

        Deque<Interval> stack = new ArrayDeque<>();

        stack.push(intervalArr[0]);

        for (int i = 1; i < intervalArr.length; i++) {
            Interval previous = stack.peek();

            Interval current = intervalArr[i];

            if (previous.end >= current.start) {
                previous.end = Math.max(previous.end, current.end);
                stack.pop();
                stack.push(previous);
            } else {
                stack.push(current);
            }
        }

        int[][] output = new int[stack.size()][2];

        for (int i = stack.size() - 1; i >= 0; i--) {
            Interval current = stack.pop();
            output[i] = new int[]{current.start, current.end};
        }

        return output;
    }

    private static class Interval {
        int start;

        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
