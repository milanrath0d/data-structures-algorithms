package org.milan.test;

/**
 * @author Milan Rathod
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Solve(3, "123"));
    }

    public static int Solve(int n, String str) {

        int[] numbers = new int[]{126, 48, 109, 121, 51, 91, 31, 112, 127, 115};

        int count = 0;

        int firstNumber = numbers[Character.getNumericValue(str.charAt(0))];

        count += countSetBits(firstNumber);

        for (int i = 1; i < n; i++) {

            int previous = numbers[Character.getNumericValue(str.charAt(i - 1))];

            int current = numbers[Character.getNumericValue(str.charAt(i))];

            int newNumber = previous ^ current;

            count += countSetBits(newNumber);
        }

        return count;
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
