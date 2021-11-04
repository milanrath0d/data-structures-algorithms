package org.milan.datastructure.heap;

import java.util.Collections;

/**
 * Implement min heap and max heap with {@link java.util.PriorityQueue}
 *
 * @author Milan Rathod
 */
public class PriorityQueue {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        // Min heap
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();

        // Max heap
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.heap(minHeap);
        priorityQueue.heap(maxHeap);
    }

    public void heap(java.util.PriorityQueue<Integer> priorityQueue) {

        // Adding items to the priorityQueue using add()
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(400);

        // Printing the most priority element
        System.out.println("Head value using peek function:" + priorityQueue.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        for (Integer integer : priorityQueue) {
            System.out.println(integer);
        }

        // Removing the top priority element (or head)
        priorityQueue.poll();

        System.out.println("After removing an element "
            + "with poll function:");
        for (Integer integer : priorityQueue) {
            System.out.println(integer);
        }

        // Removing 30 using remove()
        priorityQueue.remove(30);

        System.out.println("after removing 30 with"
            + " remove function:");
        for (Integer integer : priorityQueue) {
            System.out.println(integer);
        }

        // Check if an element is present using contains()
        boolean b = priorityQueue.contains(20);
        System.out.println("Priority queue contains 20 "
            + "or not?: " + b);

        // Getting objects from the queue using toArray()
        // in an array and print the array
        Object[] arr = priorityQueue.toArray();
        System.out.println("Value in array: ");
        for (Object o : arr) {
            System.out.println("Value: " + o.toString());
        }
    }

}
