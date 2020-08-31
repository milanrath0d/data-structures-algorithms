package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link TwoStacksWithOneArray}
 *
 * @author Milan Rathod
 */
class TwoStacksWithOneArrayTest {

    private static final String STACK1 = "Stack1";

    private static final String STACK2 = "Stack2";

    @Test
    void testPushPop() {
        TwoStacksWithOneArray twoStacksWithOneArray = new TwoStacksWithOneArray(4);

        twoStacksWithOneArray.push(STACK1, 5);

        twoStacksWithOneArray.push(STACK2, 10);

        twoStacksWithOneArray.push(STACK1, 15);

        twoStacksWithOneArray.push(STACK2, 20);

        assertEquals(15, twoStacksWithOneArray.pop(STACK1));

        assertEquals(20, twoStacksWithOneArray.pop(STACK2));
    }

}