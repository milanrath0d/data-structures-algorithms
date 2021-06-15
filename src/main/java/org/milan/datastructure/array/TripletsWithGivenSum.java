package org.milan.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/unique-triplets-sum-given-value/}
 *
 * @author Milan Rathod
 */
public class TripletsWithGivenSum {

    /**
     * Sorting based solution
     * <p>
     * Time complexity: O(N*N)
     * Space complexity: O(1)
     *
     * @param arr array of integers
     * @param sum sum
     * @return list of all triplets for which sum is zero
     */
    public List<List<Integer>> find(int[] arr, int sum) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int low = i + 1;
                int high = arr.length - 1;
                int x = arr[i];

                while (low < high) {

                    if (x + arr[low] + arr[high] == sum) {
                        output.add(Arrays.asList(x, arr[low], arr[high]));
                        while (low < high && arr[low] == arr[low + 1]) {
                            low++;
                        }
                        while (low < high && arr[high] == arr[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (x + arr[low] + arr[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return output;
    }

}
