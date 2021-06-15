package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://leetcode.com/problems/invalid-transactions/}
 *
 * @author Milan Rathod
 */
public class InvalidTransactions {

    public List<String> findAll(String[] transactions) {
        int n = transactions.length;

        String[] name = new String[n];
        int[] time = new int[n];
        int[] amount = new int[n];
        String[] city = new String[n];

        for (int i = 0; i < n; i++) {
            String[] items = transactions[i].split(",");

            name[i] = items[0];
            time[i] = Integer.parseInt(items[1]);
            amount[i] = Integer.parseInt(items[2]);
            city[i] = items[3];
        }

        boolean[] isInvalid = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (amount[i] > 1000) {
                isInvalid[i] = true;
            }

            for (int j = i + 1; j < n; j++) {
                if (name[i].equals(name[j]) &&
                        !city[i].equals(city[j]) &&
                        Math.abs(time[i] - time[j]) <= 60) {
                    isInvalid[i] = true;
                    isInvalid[j] = true;
                }
            }

        }

        List<String> output = new ArrayList<>();

        for (int i = 0; i < isInvalid.length; i++) {
            if (isInvalid[i]) {
                output.add(transactions[i]);
            }
        }

        return output;
    }

}
