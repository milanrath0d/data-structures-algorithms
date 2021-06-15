package org.milan.geeksforgeeks;

import java.util.LinkedList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/program-print-substrings-given-string/}
 *
 * @author Milan Rathod
 */
public class Substrings {

    public List<String> findAll(String input) {

        int n = input.length();

        char[] str = input.toCharArray();

        List<String> outputList = new LinkedList<>();

        // Pick starting point
        for (int len = 1; len <= n; len++) {

            // Pick ending point
            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;

                StringBuilder sb = new StringBuilder();

                for (int k = i; k <= j; k++) {
                    sb.append(str[k]);
                }

                outputList.add(sb.toString());
            }
        }

        return outputList;
    }
}
