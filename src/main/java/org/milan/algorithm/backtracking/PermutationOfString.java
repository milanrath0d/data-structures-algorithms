package org.milan.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @<a href="https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/">...</a>}
 *
 * @author Milan Rathod
 */
public class PermutationOfString {

    public List<String> permutations(String str) {
        List<String> result = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return result;
        }

        generatePermutations(new StringBuilder(str), str.length(), 0, result);

        return result;
    }

    private void generatePermutations(StringBuilder str, int n, int index, List<String> result) {
        if (index == n - 1) {
            result.add(str.toString());
            return;
        }

        for (int i = index; i < n; i++) {
            swap(str, index, i);
            generatePermutations(str, n, index + 1, result);
            swap(str, index, i);
        }
    }

    private void swap(StringBuilder str, int i, int j) {
        final char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
