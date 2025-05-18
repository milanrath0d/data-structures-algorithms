package org.milan.misc;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Milan Rathod
 */
public class MaximumSum {

    public static void main(String[] args) {
        System.out.println(minSum(Arrays.asList(10, 20, 7), 4));

        System.out.println(minSum(Arrays.asList(2, 3), 1));

        System.out.println(minSum(Arrays.asList(2), 1));
    }

    public static int minSum(List<Integer> num, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((one, two) -> two - one);

        int n = num.size();

        for (int i = 0; i < n; i++) {
            maxHeap.add(num.get(i));
        }

        while (k > 0) {

            // Remove the maximum
            int temp = (int) Math.ceil((double) maxHeap.poll() / 2);

            maxHeap.add(temp);

            k--;
        }

        return maxHeap.stream().mapToInt(value -> value).sum();
    }
}
