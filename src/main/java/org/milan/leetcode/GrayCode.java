package org.milan.leetcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Refer {@link @https://leetcode.com/problems/gray-code/}
 *
 * @author Milan Rathod
 */
public class GrayCode {

    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(grayCode.grayCode(12));

        LocalDateTime newTime = LocalDateTime.now();

        System.out.println((newTime.getNano() - localDateTime.getNano()) / 1000000L);

    }

    public List<Integer> grayCode(int n) {

        List<String> binaryGrayCodes = grayCodeUtil(n);

        return binaryGrayCodes
            .stream()
            .map(binaryGrayCode -> Integer.parseInt(binaryGrayCode, 2))
            .collect(Collectors.toList());
    }

    public List<Integer> grayCodeV2(int n) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            output.add(i ^ (i >> 1));
        }

        return output;
    }

    private List<String> grayCodeUtil(int n) {
        if (n == 1) {
            return Arrays.asList("0", "1");
        }

        List<String> grayCodeOfPreviousNumber = grayCodeUtil(n - 1);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < grayCodeOfPreviousNumber.size(); i++) {
            result.add("0" + grayCodeOfPreviousNumber.get(i));
        }

        for (int i = grayCodeOfPreviousNumber.size() - 1; i >= 0; i--) {
            result.add("1" + grayCodeOfPreviousNumber.get(i));
        }

        return result;
    }
}
