package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link CountPairs}
 *
 * @author Milan Rathod
 */
class CountPairsTest {

    @Test
    void testCount() {
        Integer[] arr1 = {3, 1, 5, 7};
        Integer[] arr2 = {8, 2, 5, 3};

        java.util.LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(arr1));
        java.util.LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(arr2));

        CountPairs countPairs = new CountPairs();

        int result = countPairs.count(list1, list2, 10);

        assertEquals(2, result);
    }

    @Test
    void testCountV2() {
        Integer[] arr1 = {3, 1, 5, 7};
        Integer[] arr2 = {8, 2, 5, 3};

        java.util.LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(arr1));
        java.util.LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(arr2));

        CountPairs countPairs = new CountPairs();

        int result = countPairs.countV2(list1, list2, 10);

        assertEquals(2, result);
    }
}