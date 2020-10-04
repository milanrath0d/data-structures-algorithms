package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://www.geeksforgeeks.org/nuts-bolts-problem-lock-key-problem/}
 *
 * @author Milan Rathod
 */
public class NutsAndBoltsProblem {

    /**
     * Using quick sort method
     * <p>
     * Time complexity: O(nlogn)
     *
     * @param nuts  array of nuts
     * @param bolts array of bolts
     */
    public void matchPairs(char[] nuts, char[] bolts) {
        matchPairs(nuts, bolts, 0, nuts.length - 1);
    }

    /**
     * @param nuts  array of nuts
     * @param bolts array of bolts
     * @param low   first index
     * @param high  last index
     */
    private void matchPairs(char[] nuts, char[] bolts, int low,
                            int high) {
        if (low < high) {
            // Choose last character of bolts array for nuts partition
            int pivot = partition(nuts, low, high, bolts[high]);

            // Now using the partition of nuts choose that for bolts partition
            partition(bolts, low, high, nuts[pivot]);

            // Recur for [low...pivot-1] & [pivot+1...high] for nuts and bolts array
            matchPairs(nuts, bolts, low, pivot - 1);
            matchPairs(nuts, bolts, pivot + 1, high);
        }
    }

    /**
     * Similar to standard partition method. Here we pass the pivot element
     * too instead of choosing it inside the method
     */
    private int partition(char[] arr, int low, int high, char pivot) {
        int i = low;
        char temp1;
        char temp2;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
            } else if (arr[j] == pivot) {
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;

        // Return the partition index of an array based on the pivot element of other array
        return i;
    }
}
