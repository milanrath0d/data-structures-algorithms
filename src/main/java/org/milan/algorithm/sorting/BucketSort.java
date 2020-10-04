package org.milan.algorithm.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/bucket-sort-2/}
 *
 * @author Milan Rathod
 */
public class BucketSort {

    /**
     * Use this method for positive numbers
     *
     * @param arr input array
     */
    public void sort(float[] arr) {
        int n = arr.length;

        if (n <= 0) {
            return;
        }

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        LinkedList<Float>[] buckets = new LinkedList[n];

        // Takes O(n) time complexity
        for (int i = 0; i < n; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float index = arr[i] * n;
            buckets[(int) index].add(arr[i]);
        }

        // Sort individual buckets -- takes O(n) if all elements are uniformly distributed
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;

        // Concentrate all buckets into arr -- takes O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    /**
     * Use this method for positive & negative numbers
     *
     * @param arr input array
     */
    public void sortAll(float[] arr) {
        List<Float> negativeList = new LinkedList<>();
        List<Float> positiveList = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Store -ve elements by converting into +ve element
                negativeList.add(-1 * arr[i]);
            } else {
                // Store +ve elements
                positiveList.add(arr[i]);
            }
        }

        float[] positiveArray = new float[positiveList.size()];

        for (int i = 0; i < positiveList.size(); i++) {
            positiveArray[i] = positiveList.get(i);
        }

        float[] negativeArray = new float[negativeList.size()];

        for (int i = 0; i < negativeList.size(); i++) {
            negativeArray[i] = negativeList.get(i);
        }

        // Sort positive and negative arrays using bucket sort
        sort(positiveArray);
        sort(negativeArray);

        // First store elements of negativeArray by converting into -ve
        for (int i = 0; i < negativeArray.length; i++) {
            arr[i] = -1 * negativeArray[negativeArray.length - i - 1];
        }

        // Store +ve elements
        for (int j = negativeArray.length; j < arr.length; j++) {
            arr[j] = positiveArray[j - negativeArray.length];
        }
    }
}
