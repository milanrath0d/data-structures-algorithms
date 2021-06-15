package org.milan.hackerearth;

import java.util.Arrays;

/**
 * Refer {@link @https://www.hackerearth.com/practice/algorithms/dynamic-programming/bit-masking/practice-problems/algorithm/trophy-of-xorasia-0a2d466a/}
 *
 * @author Milan Rathod
 */
public class IntegerDistribution {

    public long[] getMinAndMax(long[] arr) {

        int N = arr.length;

        long[] dpMax = new long[1 << N];
        long[] dpMin = new long[1 << N];

        Arrays.fill(dpMin, 1000000000000000L);
        Arrays.fill(dpMax, -1);

        dpMax[0] = dpMin[0] = 0L;

        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) == 0) {
                    for (int k = j + 1; k < N; k++)
                        if ((i & (1 << k)) == 0) {
                            int temp = i + (1 << j) + (1 << k);
                            dpMax[temp] = Math.max(dpMax[temp], dpMax[i] + (arr[j] ^ arr[k]));
                            dpMin[temp] = Math.min(dpMin[temp], dpMin[i] + (arr[j] ^ arr[k]));
                        }
                    break;
                }
            }
        }

        long[] output = new long[2];
        output[0] = dpMin[(1 << N) - 1];
        output[1] = dpMax[(1 << N) - 1];
        return output;
    }

}
