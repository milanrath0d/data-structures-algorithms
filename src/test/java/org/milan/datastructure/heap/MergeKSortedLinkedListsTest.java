package org.milan.datastructure.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.datastructure.linkedlist.LinkedList;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MergeKSortedLinkedLists}
 *
 * @author Milan Rathod
 */
class MergeKSortedLinkedListsTest {

    private LinkedList<Integer> linkedList1;

    private LinkedList<Integer> linkedList2;

    private LinkedList<Integer> linkedList3;

    @BeforeEach
    void setup() {
        linkedList1 = new LinkedList<>(new LinkedList.Node<>(2));
        linkedList1.insertAtEnd(6);
        linkedList1.insertAtEnd(12);
        linkedList1.insertAtEnd(34);

        linkedList2 = new LinkedList<>(new LinkedList.Node<>(1));
        linkedList2.insertAtEnd(9);
        linkedList2.insertAtEnd(20);
        linkedList2.insertAtEnd(40);

        linkedList3 = new LinkedList<>(new LinkedList.Node<>(5));
        linkedList3.insertAtEnd(23);
        linkedList3.insertAtEnd(45);
        linkedList3.insertAtEnd(50);
    }

    @Test
    void testMerge() {
        MergeKSortedLinkedLists mergeKSortedLinkedLists = new MergeKSortedLinkedLists();

        List<LinkedList.Node<Integer>> lists = Arrays.asList(linkedList1.getHead(),
                linkedList2.getHead(), linkedList3.getHead());

        LinkedList.Node<Integer> mergedHead = mergeKSortedLinkedLists.merge(lists, 3);

        LinkedList<Integer> resultList = new LinkedList<>(mergedHead);

        assertArrayEquals(new Integer[]{1, 2, 5, 6, 9, 12, 20, 23, 34, 40, 45, 50}, resultList.toArray(Integer.class));
    }
}