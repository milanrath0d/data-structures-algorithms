package org.milan.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Refer {@link @https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/}
 *
 * @author Milan Rathod
 */
public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n - 1][n - 1];

        while (start < end) {
            int mid = (start) + (end - start) / 2;

            // First number is the smallest and the second number is the largest
            int[] smallLargePair = new int[]{matrix[0][0], matrix[n - 1][n - 1]};

            int count = countLessEqual(matrix, mid, smallLargePair);

            if (count == k) {
                return smallLargePair[0];
            }

            if (count < k) {
                // Search higher
                start = smallLargePair[1];
            } else {
                // Search lower
                end = smallLargePair[0];
            }

        }

        return start;
    }

    public int kthSmallestV2(int[][] matrix, int k) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> matrix[n.row][n.col]));

        // put the 1st element of each row in the min heap
        // we don't need to push more than 'k' elements in the heap
        for (int i = 0; i < matrix.length && i < k; i++)
            minHeap.add(new Node(i, 0));

        // take the smallest (top) element form the min heap, if the running count is equal to k return the number
        // if the row of the top element has more elements, add the next element to the heap
        int numberCount = 0, result = 0;
        while (!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            result = matrix[node.row][node.col];
            if (++numberCount == k)
                break;
            node.col++;
            if (matrix[0].length > node.col)
                minHeap.add(node);
        }
        return result;
    }

    private int countLessEqual(int[][] matrix, int mid, int[] smallLargePair) {
        int count = 0;
        int n = matrix.length;
        int row = n - 1;
        int column = 0;

        while (row >= 0 && column < n) {
            if (matrix[row][column] > mid) {
                // as matrix[row][col] is bigger than the mid, let's keep track of the
                // smallest number greater than the mid
                smallLargePair[1] = Math.min(smallLargePair[1], matrix[row][column]);
                row--;
            } else {
                // as matrix[row][col] is less than or equal to the mid, let's keep track of the
                // biggest number less than or equal to the mid
                smallLargePair[0] = Math.max(smallLargePair[0], matrix[row][column]);
                count += row + 1;
                column++;
            }
        }

        return count;
    }

    private static class Node {
        int row;
        int col;

        Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

}
