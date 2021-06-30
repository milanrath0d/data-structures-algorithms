package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/largest-odd-number-in-string/}
 *
 * @author Milan Rathod
 */
public class LargestOddNumberInString {

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            if (((int) num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
