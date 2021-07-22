package org.milan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Milan Rathod
 */
public class CustomSortString {

    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();

        System.out.println(customSortString.customSortString("cba", "abcd"));

        System.out.println(customSortString.customSortString("cbafg", "abcd"));
    }

    public String customSortString(String order, String str) {

        int[] countingArr = new int[26];

        // Count str characters
        for (char ch : str.toCharArray()) {
            ++countingArr[ch - 'a'];
        }

        StringBuilder output = new StringBuilder();

        // Append characters of order to the output string as many times as they appear in str
        for (char ch : order.toCharArray()) {
            while (countingArr[ch - 'a']-- > 0) {
                output.append(ch);
            }
        }

        // Append rest of the str characters to output string
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            while (countingArr[ch - 'a']-- > 0) {
                output.append(ch);
            }
        }

        return output.toString();
    }

}
