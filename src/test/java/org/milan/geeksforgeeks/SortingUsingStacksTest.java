package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class {@link SortingUsingStacks}
 *
 * @author Milan Rathod
 */
class SortingUsingStacksTest {

    @Test
    void sortStack() {
        SortingUsingStacks sortingUsingStacks = new SortingUsingStacks();

        Deque<Integer> stack = new ArrayDeque<>(List.of(34, 3, 31, 98, 92, 23));

        assertTrue(ListUtil.isEqual(Arrays.asList(3, 23, 31, 34, 92, 98),
            new ArrayList<>(sortingUsingStacks.sortStack(stack))));
    }

    @Test
    void sortArray() {
        SortingUsingStacks sortingUsingStacks = new SortingUsingStacks();

        assertArrayEquals(new int[]{3, 23, 31, 34, 92, 98}, sortingUsingStacks.sortArray(
            new int[]{34, 3, 31, 98, 92, 23}
        ));
    }
}