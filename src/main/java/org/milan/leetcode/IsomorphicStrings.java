package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/isomorphic-strings/}
 *
 * @author Milan Rathod
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String source, String target) {

        // src array for storing ASCII chars of source string
        int[] srcArr = new int[256];

        // target array for storing ASCII chars of target string
        int[] tarArr = new int[256];

        // Iterate through both the strings
        for (int i = 0; i < source.length(); i++) {

            // Current char of source string
            char src = source.charAt(i);

            // Current char of target string
            char tar = target.charAt(i);

            // If count of ascii chars are not matching return false
            if (srcArr[src] != tarArr[tar]) {
                return false;
            }

            // Update the value of ascii char of both arrays with current index
            srcArr[src] = i + 1;
            tarArr[tar] = i + 1;
        }

        return true;
    }
}
