package org.milan.datastructure.stack;

import org.milan.exception.StackUnderflowError;

/**
 * Problem: Implement three stacks in single array
 * <p>
 * NOTE: with below implementation one position occupied by base3 pointer is
 * getting wasted if there is zero push operation performed on stack 3
 *
 * @author Milan Rathod
 */
public class ThreeStacksWithOneArray {

    /**
     * Top pointer for stack 1
     */
    private int top1;

    /**
     * Top pointer for stack 2
     */
    private int top2;

    /**
     * Base pointer for stack 3
     * NOTE: this is needed because top pointer for stack 3 will start from middle
     * of the stack and we might have to shift it left/right accordingly
     * also needed for checking overflow/underflow condition
     */
    private int base3;

    /**
     * top pointer for stack 3
     */
    private int top3;

    /**
     * size of the array
     */
    private int size;

    private int[] stack;

    private static final String INVALID_STACK = " is not valid stack number";

    public ThreeStacksWithOneArray(int size) {

        if (size < 3) {
            throw new IllegalStateException("Size < 3 is not permissible");
        }

        stack = new int[size];
        this.size = size;
        top1 = -1;
        top2 = size;

        // We can use size/3 also
        base3 = size / 2;
        top3 = base3 - 1;
    }

    /**
     * push item to stack specified by stack number
     *
     * @param stackNumber stack in which item to be pushed
     * @param item        item
     */
    public void push(int stackNumber, int item) {
        if (stackNumber == 1) {
            if (top1 + 1 == base3) {
                if (isStack3RightShiftable()) {
                    shiftStack3ToRight();
                    stack[++top1] = item;
                } else {
                    throw new StackOverflowError("Stack 1 is full");
                }
            } else {
                stack[++top1] = item;
            }
        } else if (stackNumber == 2) {
            if (top2 - 1 == top3) {
                if (isStack3LeftShiftable()) {
                    shiftStack3ToLeft();
                    stack[--top2] = item;
                } else {
                    throw new StackOverflowError("Stack 2 is full");
                }
            } else {
                stack[--top2] = item;
            }
        } else if (stackNumber == 3) {
            if (top2 - 1 == top3) {
                if (isStack3LeftShiftable()) {
                    shiftStack3ToLeft();
                    stack[++top3] = item;
                } else {
                    throw new StackOverflowError("Stack 3 is full");
                }
            } else {
                stack[++top3] = item;
            }
        } else {
            throw new IllegalArgumentException(stackNumber + INVALID_STACK);
        }
    }

    /**
     * pop item from stack specified by stack number
     *
     * @param stackNumber stack from which item to be popped
     * @return item
     */
    public int pop(int stackNumber) {
        if (stackNumber == 1) {
            if (isEmpty(1)) {
                throw new StackUnderflowError("Stack 1 is empty");
            } else {
                int item = stack[top1];
                stack[top1--] = Integer.MIN_VALUE;
                return item;
            }
        } else if (stackNumber == 2) {
            if (isEmpty(2)) {
                throw new StackUnderflowError("Stack 2 is empty");
            } else {
                int item = stack[top2];
                stack[top2++] = Integer.MIN_VALUE;
                return item;
            }
        } else if (stackNumber == 3) {
            if (isEmpty(3)) {
                throw new StackUnderflowError("Stack 3 is empty");
            } else {
                int item = stack[top3];
                stack[top3--] = Integer.MIN_VALUE;
                return item;
            }
        } else {
            throw new IllegalArgumentException(stackNumber + INVALID_STACK);
        }
    }

    /**
     * return top of the stack specified by stack number
     *
     * @param stackNumber stack for which top is requested
     * @return top of the stack
     */
    public int top(int stackNumber) {
        if (stackNumber == 1) {
            if (isEmpty(1)) {
                throw new StackUnderflowError("Stack 1 is empty");
            } else {
                return stack[top1];
            }
        } else if (stackNumber == 2) {
            if (isEmpty(2)) {
                throw new StackUnderflowError("Stack 2 is empty");
            } else {
                return stack[top2];
            }
        } else if (stackNumber == 3) {
            if (isEmpty(3)) {
                throw new StackUnderflowError("Stack 3 is empty");
            } else {
                return stack[top3];
            }
        } else {
            throw new IllegalArgumentException(stackNumber + INVALID_STACK);
        }
    }

    /**
     * check if stack with stack number specified is empty or not
     *
     * @param stackNumber stack for which emptiness to be checked
     * @return true if empty otherwise false
     */
    public boolean isEmpty(int stackNumber) {
        if (stackNumber == 1) {
            return top1 == -1;
        } else if (stackNumber == 2) {
            return top2 == this.size;
        } else if (stackNumber == 3) {
            return (top3 == base3 - 1);
        } else {
            throw new IllegalArgumentException(stackNumber + INVALID_STACK);
        }
    }

    /**
     * shift stack 3 to left
     */
    private void shiftStack3ToLeft() {
        for (int i = base3 - 1; i < top3 - 1; i++) {
            stack[i] = stack[i + 1];
        }
        stack[top3--] = Integer.MIN_VALUE;
        base3--;
    }

    /**
     * check if stack 3 is left shiftable
     *
     * @return true if stack 3 is left shiftable otherwise false
     */
    private boolean isStack3LeftShiftable() {
        return top1 + 1 < base3;
    }

    /**
     * shift stack 3 to right
     */
    private void shiftStack3ToRight() {
        for (int i = top3 + 1; i > base3 + 1; i--) {
            stack[i] = stack[i - 1];
        }
        stack[base3++] = Integer.MIN_VALUE;
        top3++;
    }

    /**
     * check if stack 3 is right shiftable
     *
     * @return true if stack 3 is right shiftable otherwise false
     */
    private boolean isStack3RightShiftable() {
        return top3 + 1 < top2;
    }

}
