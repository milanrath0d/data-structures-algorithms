package org.milan.hackerearth;

import java.util.Map;

/**
 * {@link @https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/what-is-the-string-made-of-2/}
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Milan Rathod
 */
public class StringMadeOf {

    private static final Map<Integer, Integer> mapping = Map.of(0, 6,
        1, 2,
        2, 5,
        3, 5,
        4, 4,
        5, 5,
        6, 6,
        7, 3,
        8, 7,
        9, 6);

    public int countDashes(String inputString) {

        char[] chars = inputString.toCharArray();

        int sum = 0;

        for (char ch : chars) {
            sum += mapping.get(Character.getNumericValue(ch));
        }

        return sum;
    }
}
