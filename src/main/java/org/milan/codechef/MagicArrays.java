package org.milan.codechef;

import java.util.List;

/**
 * Refer {@link @https://www.codechef.com/problems/MARRAYS}
 *
 * @author Milan Rathod
 */
public class MagicArrays {

    /**
     * Based on equation: F(i,x) = max[F(i-1,j) + (A(i-1)[j-1] - A(i)[x])*i, F(i-1,j) - (A(i-1)[j-1] + A(i)[x])*i]
     * <p>
     * Time complexity: O(N)
     * Space complexity: O(N)
     *
     * @param magicArrayList given input
     * @return maximum quality dishes
     */
    public long getMaxQualityDishes(List<List<Integer>> magicArrayList) {

        if (magicArrayList.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }

        long[] max = new long[2];
        max[0] = -(int) 1e6 - 1;
        List<Integer> firstArray = magicArrayList.get(0);
        for (int i = 0; i < firstArray.size(); i++) {
            long a = firstArray.get(i);
            max[0] = Math.max(max[0], -a);
            max[1] = Math.max(max[1], a);
        }

        long ans = 0;
        for (int i = 1; i < magicArrayList.size(); i++) {
            long[] max2 = new long[2];
            max2[0] = Long.MIN_VALUE;
            int m = magicArrayList.get(i).size();
            List<Integer> currentArray = magicArrayList.get(i);
            long[] arr = new long[m];
            for (int j = 0; j < m; j++)
                arr[j] = currentArray.get(j);
            for (int j = 0; j < m; j++) {
                long b1 = max[0] + i * arr[j];
                long b2 = max[1] - i * arr[j];
                ans = Math.max(ans, Math.max(b1, b2));
                int index = (j - 1 + m) % m;
                long c1 = Math.max(b1, b2) - (i + 1) * arr[index];
                long c2 = Math.max(b1, b2) + (i + 1) * arr[index];
                max2[0] = Math.max(max2[0], c1);
                max2[1] = Math.max(max2[1], c2);
            }
            max[0] = max2[0];
            max[1] = max2[1];
        }
        return ans;
    }
}
