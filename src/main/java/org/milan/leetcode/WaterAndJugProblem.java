package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/water-and-jug-problem/}
 *
 * @author Milan Rathod
 */
public class WaterAndJugProblem {

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        // If targetCapacity is more than sum capacity of jug1 and jug2 returns false
        if ((jug1Capacity + jug2Capacity) < targetCapacity) {
            return false;
        }

        // Based on linear equation with two unknowns: ax+by=c,
        // where a is jug1Capacity, b is jug2Capacity and c is targetCapacity.
        // The equation should be solved in integer numbers.
        // Note, x and y may be negative number if one needs to pour water from jug.
        // This is actually a Diophantine equation. It is solvable only if c is divisible by gcd of a and b.
        return targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
