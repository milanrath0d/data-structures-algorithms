package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://practice.geeksforgeeks.org/problems/pattern-jumping/0}
 *
 * @author Milan Rathod
 */
public class PatternJumping {

    public boolean isJumpPossible(int number) {
        return (number & (number - 1)) == 0;
    }

    public boolean isJumpPossibleV2(int number) {
        for (int i = 0; i < 17; i++) {
            int num = (int) Math.pow(2, i);
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
