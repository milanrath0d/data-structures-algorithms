package org.milan.algorithm.dynamic;

/**
 * Problem: refer {@link @https://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/}
 *
 * @author Milan Rathod
 */
public class ReachGivenScore {

    public int count(int n) {
        int[] table = new int[n + 1];

        // Base case (If given value is 0)
        table[0] = 1;

        int i;
        for (i = 3; i <= n; i++)
            table[i] += table[i - 3];
        for (i = 5; i <= n; i++)
            table[i] += table[i - 5];
        for (i = 10; i <= n; i++)
            table[i] += table[i - 10];

        return table[n];
    }
}
