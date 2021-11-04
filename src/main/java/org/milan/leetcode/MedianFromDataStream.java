package org.milan.leetcode;


import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Refer {@link @https://leetcode.com/problems/find-median-from-data-stream/}
 *
 * @author Milan Rathod
 */
public class MedianFromDataStream {

    private final PriorityQueue<Integer> largeNumbers;

    private final PriorityQueue<Integer> smallNumbers;

    private boolean isEven = true;

    public MedianFromDataStream() {
        largeNumbers = new PriorityQueue<>();

        smallNumbers = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (isEven) {
            largeNumbers.offer(num);
            smallNumbers.offer(largeNumbers.poll());
        } else {
            smallNumbers.offer(num);
            largeNumbers.offer(smallNumbers.poll());
        }

        isEven = !isEven;
    }

    public double findMedian() {
        if (isEven) {
            return (largeNumbers.peek() + smallNumbers.peek()) / 2.0;
        } else {
            return smallNumbers.peek();
        }
    }
}
