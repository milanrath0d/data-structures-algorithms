package org.milan.geeksforgeeks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/}
 *
 * @author Milan Rathod
 */
public class BiggestNumber {

    public String find(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().sorted((o1, o2) -> {
            String s1 = o1 + String.valueOf(o2);
            String s2 = o2 + String.valueOf(o1);

            return s2.compareTo(s1);
        }).collect(Collectors.toList());

        StringBuilder output = new StringBuilder();

        list.forEach(output::append);

        return new BigInteger(output.toString()).toString();
    }

    /**
     * Refer {@link @https://www.geeksforgeeks.org/arrange-given-numbers-form-biggest-number-set-2/?ref=rp}
     *
     * @param arr given array of integers
     * @return biggest number
     */
    public String findV2(int[] arr) {

        int maxElement = Arrays.stream(arr).max().getAsInt();

        int maxLength = String.valueOf(maxElement).length();

        List<ExtendedNum> extendedNumList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            extendedNumList.add(new ExtendedNum(arr[i], maxLength));
        }

        extendedNumList.sort((o1, o2) -> (int) (o2.modifiedValue - o1.modifiedValue));

        StringBuilder output = new StringBuilder();

        extendedNumList.forEach(extendedNum -> output.append(extendedNum.originalValue));

        return new BigInteger(output.toString()).toString();
    }

    static class ExtendedNum {
        int originalValue;

        long modifiedValue;

        public ExtendedNum(int originalValue, int n) {
            this.originalValue = originalValue;
            String s = Integer.toString(originalValue);
            StringBuilder sb = new StringBuilder();
            while (sb.length() <= n) {
                sb.append(s);
            }

            this.modifiedValue = Long.parseLong(sb.substring(0, n + 1));
        }
    }
}
