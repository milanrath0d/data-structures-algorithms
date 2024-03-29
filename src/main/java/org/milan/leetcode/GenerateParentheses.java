package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://leetcode.com/problems/generate-parentheses/}
 * <p>
 * Time complexity: (2 power of n)
 *
 * @author Milan Rathod
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesisUtil(list, "", 0, 0, n);
        return list;
    }

    private void generateParenthesisUtil(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            generateParenthesisUtil(list, str + "(", open + 1, close, max);
        if (close < open)
            generateParenthesisUtil(list, str + ")", open, close + 1, max);
    }
}
