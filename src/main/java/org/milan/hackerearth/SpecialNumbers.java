package org.milan.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * A number that can be represented as the sum of two distinct single-digit numbers that
 * are odd and prime in nature with each of the two prime numbers consisting of positive power.
 * <p>
 * For converting a non-special number a special number, you have to perform any one of the following operations:
 * <p>
 * 1. Increase the given number by 1 and the associated cost for this operation is called IncreasingCost.
 * 2. Decrease the number by 1 the associated cost for this operation is called DecreasingCost.
 * <p>
 * Your task is to convert the given number into a special number at a minimum cost.
 * <p>
 * Example: To make 4 a special number we can increment the number 4 times to make it 8.
 * 8 is a special number since it can be represented as 3^1 + 5^1.
 * Increment cost is 8 so total cost is 8+8+8+8=32
 *
 * @author Milan Rathod
 */
public class SpecialNumbers {

    private TreeSet<Long> sumCache;

    public SpecialNumbers() {
        init();
    }

    public long minCost(int number, int decreasingCost, int increasingCost) {

        if (sumCache.contains((long) number)) return 0;

        Long lower = sumCache.lower((long) number);
        Long higher = sumCache.higher((long) number);

        if (lower != null && higher != null) {
            return Math.min((number - lower) * decreasingCost, (higher - number) * increasingCost);
        } else if (lower != null) {
            return (number - lower) * decreasingCost;
        } else if (higher != null) {
            return (higher - number) * increasingCost;
        } else {
            throw new IllegalArgumentException("Not Possible!");
        }
    }

    private void init() {

        TreeSet<Long> sumCache = new TreeSet<>();

        int count3;
        List<Long> threesList = new ArrayList<>();
        threesList.add(1L);
        List<Long> fivesList = new ArrayList<>();
        fivesList.add(1L);
        List<Long> sevensList = new ArrayList<>();
        sevensList.add(1L);
        for (int i = 1; ; i++) {
            threesList.add(i, threesList.get(i - 1) * 3L);
            if (threesList.get(i) > 1e9) {
                count3 = i;
                break;
            }
        }

        int count5;
        for (int i = 1; ; i++) {
            fivesList.add(i, fivesList.get(i - 1) * 5L);
            if (fivesList.get(i) > 1e9) {
                count5 = i;
                break;
            }
        }

        int count7;
        for (int i = 1; ; i++) {
            sevensList.add(i, sevensList.get(i - 1) * 7L);
            if (sevensList.get(i) > 1e9) {
                count7 = i;
                break;
            }
        }

        sum(sumCache, count3, count5, threesList, fivesList);

        sum(sumCache, count3, count7, threesList, sevensList);

        sum(sumCache, count5, count7, fivesList, sevensList);

        this.sumCache = sumCache;
    }

    private void sum(Set<Long> sumCache, int count1, int count2, List<Long> firstList, List<Long> secondList) {
        for (int i = 1; i < count1; i++) {
            for (int j = 1; j < count2; j++) {
                long value = firstList.get(i) + secondList.get(j);
                sumCache.add(value);
                if (value > 1e9) {
                    break;
                }
            }
        }
    }
}
