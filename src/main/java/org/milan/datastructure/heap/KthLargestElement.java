package org.milan.datastructure.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * refer {@link @https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/}
 *
 * @author Milan Rathod
 */
public class KthLargestElement {

    /**
     * Naive approach: perform deletion k times in max heap
     * <p>
     * Time complexity: O(k*logn)
     *
     * @param arr given an array
     * @param k   kth element
     * @return kth largest element
     */
    public int find(int[] arr, int k) {

        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }

        BinaryHeap binaryHeap = buildMaxBinaryHeap(arr);

        Arrays.stream(arr, 0, k - 1).forEach(value -> binaryHeap.delete());

        return binaryHeap.delete();
    }

    /**
     * Second approach: use of a priority queue
     * <p>
     * Timex complexity: O(k*logk)
     *
     * @param arr given an array
     * @param k   kth element
     * @return kth largest element
     */
    public int findV2(int[] arr, int k) {

        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }

        BinaryHeap binaryHeap = buildMaxBinaryHeap(arr);

        return KthSmallestElement.getKthElement(binaryHeap, k);
    }

    /**
     * Third approach: use of a min-heap with size k
     * <p>
     * Time complexity: O(n log k)
     * Space complexity: O(k)
     *
     * @param arr given an array
     * @param k   kth element
     * @return kth largest element
     */
    public int findV3(int[] arr, int k) {
        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }

        // Create a min-heap with k elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        // Add first k elements to the min-heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }
        
        // For remaining elements, if current element is larger than min element
        // in heap, replace the min element with current element
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }
        
        // The min element in the heap is the kth largest element
        return minHeap.peek();
    }

    /**
     * Fourth approach: QuickSelect algorithm (Hoare's selection algorithm)
     * <p>
     * Time complexity: O(n) average case, O(n²) worst case
     * Space complexity: O(1)
     *
     * @param arr given an array
     * @param k   kth element
     * @return kth largest element
     */
    public int findV4(int[] arr, int k) {
        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }
        
        // Create a copy of the array to avoid modifying the original array
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        
        // For kth largest, we need (n-k+1)th smallest
        return quickSelect(arrCopy, 0, arrCopy.length - 1, arrCopy.length - k);
    }
    
    private int quickSelect(int[] nums, int left, int right, int k) {
        // If the list contains only one element, return that element
        if (left == right) {
            return nums[left];
        }
        
        // Select a pivot randomly
        int pivotIndex = left + (int) (Math.random() * (right - left + 1));
        
        // Get the pivotIndex in the sorted position
        pivotIndex = partition(nums, left, right, pivotIndex);
        
        // The pivot is in its final sorted position
        if (pivotIndex == k) {
            return nums[k];
        } else if (pivotIndex > k) {
            // If pivot position is greater than k, search in the left subarray
            return quickSelect(nums, left, pivotIndex - 1, k);
        } else {
            // If pivot position is less than k, search in the right subarray
            return quickSelect(nums, pivotIndex + 1, right, k);
        }
    }
    
    private int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        
        // Move pivot to the end
        swap(nums, pivotIndex, right);
        
        // Move all elements smaller than pivot to the left
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }
        
        // Move pivot to its final place
        swap(nums, storeIndex, right);
        
        return storeIndex;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * Build maximum binary heap from a given array and return
     */
    private BinaryHeap buildMaxBinaryHeap(int[] arr) {
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);

        binaryHeap.buildHeap(arr);

        return binaryHeap;
    }
}
