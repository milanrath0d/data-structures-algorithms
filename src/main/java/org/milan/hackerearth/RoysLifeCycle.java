package org.milan.hackerearth;

/**
 * {@link @https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/roys-life-cycle-44/}
 *
 * @author Milan Rathod
 */
public class RoysLifeCycle {

    private int longestCodingStreakAcross = 0;

    private int codingStreakAcross = 0;

    public int getLongestCodingStreakPerDay(String input) {
        char[] arr = input.toCharArray();

        int tempDayCount = 0;

        int finalDayCount = 0;

        int tempContinuousStreak = codingStreakAcross;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'C') {
                tempDayCount++;
                tempContinuousStreak++;
            } else {
                if (tempDayCount > finalDayCount) {
                    finalDayCount = tempDayCount;
                }
                tempDayCount = 0;

                if (tempContinuousStreak > longestCodingStreakAcross) {
                    longestCodingStreakAcross = tempContinuousStreak;
                }
                tempContinuousStreak = 0;
            }
        }

        codingStreakAcross = tempContinuousStreak;

        if (tempDayCount > finalDayCount) {
            finalDayCount = tempDayCount;
        }

        if (codingStreakAcross > longestCodingStreakAcross) {
            longestCodingStreakAcross = codingStreakAcross;
        }

        return finalDayCount;
    }

    public int getLongestCodingStreakAcross() {
        return longestCodingStreakAcross;
    }
}
