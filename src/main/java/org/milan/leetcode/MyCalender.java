package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Refer {@link @https://leetcode.com/problems/my-calendar-i/}
 *
 * @author Milan Rathod
 */
public class MyCalender {

    private final List<int[]> calender;

    private final TreeMap<Integer, Integer> treeMap;

    public MyCalender() {
        calender = new ArrayList<>();
        treeMap = new TreeMap<>();
    }

    /**
     * Time complexity: O(N*N)
     * Space complexity: O(N)
     *
     * @param start start time
     * @param end   end time
     * @return true if booking is possible otherwise false
     */
    public boolean book(int start, int end) {
        for (int[] interval : calender) {
            if (interval[0] < end && start < interval[1]) {
                return false;
            }
        }
        calender.add(new int[]{start, end});
        return true;
    }

    /**
     * Time complexity: O(N*logN)
     * Space complexity: O(N)
     *
     * @param start start time
     * @param end   end time
     * @return true if booking is possible otherwise false
     */
    public boolean bookV2(int start, int end) {
        Integer prev = treeMap.floorKey(start);
        Integer next = treeMap.ceilingKey(start);

        if ((prev == null || treeMap.get(prev) <= start) &&
            (next == null || end <= next)) {
            treeMap.put(start, end);
            return true;
        }
        return false;
    }

}
