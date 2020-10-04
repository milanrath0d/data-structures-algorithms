package org.milan.datastructure.heap;

import org.milan.datastructure.linkedlist.LinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Problem: Similar to this problem {@link MergeKSortedArrays}
 *
 * @author Milan Rathod
 */
public class MergeKSortedLinkedLists {

    /**
     * Merge all sorted linked lists into one list
     *
     * @param lists list of head of all sorted linked list
     * @param k     numbers of sorted linked list to be merged
     * @return head of merged linked list
     */
    public LinkedList.Node<Integer> merge(List<LinkedList.Node<Integer>> lists, int k) {

        PriorityQueue<LinkedList.Node<Integer>> priorityQueue = new PriorityQueue<>(k, Comparator.comparingInt(LinkedList.Node::getData));

        for (LinkedList.Node<Integer> head : lists) {
            if (head != null) {
                priorityQueue.add(head);
            }
        }

        LinkedList.Node<Integer> head = null;
        LinkedList.Node<Integer> current = null;
        while (!priorityQueue.isEmpty()) {
            if (head == null) {
                head = priorityQueue.poll();
                current = head;
            } else {
                current.setNext(priorityQueue.poll());
                current = current.getNext();
            }

            if (current.getNext() != null) {
                priorityQueue.add(current.getNext());
            }
        }
        return head;
    }

}
