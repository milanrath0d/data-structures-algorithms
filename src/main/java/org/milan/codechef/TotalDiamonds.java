package org.milan.codechef;

/**
 * Problem: {@link @https://www.codechef.com/problems/VK18}
 *
 * @author Milan Rathod
 */
public class TotalDiamonds {

    private final long[] diamonds;

    public TotalDiamonds() {
        diamonds = new long[1000001];
        long[] prefix = new long[2000001];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + f(i);
        }

        for (int i = 1; i < diamonds.length; i++) {
            diamonds[i] = diamonds[i - 1] + 2 * (prefix[2 * i] - prefix[i]) - f(2 * i);
        }
    }

    public long getTotal(int N) {
        return diamonds[N];
    }

    private long f(int x) {
        int oddSum = 0, evenSum = 0;
        while (x > 0) {
            int digit = x % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            x = x / 10;
        }
        return Math.abs(oddSum - evenSum);
    }
}
