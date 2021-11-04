package org.milan.hackerearth;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link @https://www.hackerearth.com/practice/algorithms/dynamic-programming/state-space-reduction/practice-problems/algorithm/bytelandian-gold-coins/}
 *
 * @author Milan Rathod
 */
public class BytelandianGoldCoins {

    private final Map<Long, Long> memoizedResult = new HashMap<>();

    /**
     * @param coin given gold coin
     * @return maximum amount of dollars you can get for given gold coin
     */
    public long computeMaxExchangeInDollar(long coin) {
        if (coin == 0) {
            return coin;
        } else {
            if (memoizedResult.get(coin) == null) {
                long result = Math.max(coin, computeMaxExchangeInDollar(coin / 2)
                    + computeMaxExchangeInDollar(coin / 3) + computeMaxExchangeInDollar(coin / 4));
                memoizedResult.put(coin, result);
                return result;
            } else {
                return memoizedResult.get(coin);
            }
        }
    }
}
