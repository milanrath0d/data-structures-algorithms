package org.milan.datastructure.string;

/**
 * Problem: String Rotation
 *
 * @author Milan Rathod
 */
public class StringsRotation {

    /**
     * Time complexity: O(nm) where n is size of concatenated version of s1 with itself
     * and m is size of string s2
     * Space complexity: O(1)
     *
     * @param s1 first string
     * @param s2 second string
     * @return true if second string is rotation of first string; otherwise false
     */
    public boolean isRotated(String s1, String s2) {
        if ((s1 == null || s2 == null) || s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }

    /**
     * Using KMS algorithm's lps
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param s1 first string
     * @param s2 second string
     * @return true if second string is rotation of first string; otherwise false
     */
    public boolean isRotatedV2(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Base case
        if (n != m)
            return false;

        // Create lps[] that will hold the longest prefix suffix values for pattern
        int[] lps = new int[n];

        // Length of the previous longest prefix suffix
        int len = 0;
        int i = 1;

        // lps[0] is always 0
        lps[0] = 0;

        // the loop calculates lps[i] for i = 1 to n-1
        while (i < n) {
            if (s1.charAt(i) == s2.charAt(len)) {
                lps[i] = ++len;
                ++i;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    ++i;
                } else {
                    len = lps[len - 1];
                }
            }
        }

        i = 0;

        // Match from that rotating point
        for (int k = lps[n - 1]; k < m; ++k) {
            if (s2.charAt(k) != s1.charAt(i++))
                return false;
        }
        return true;
    }

}
