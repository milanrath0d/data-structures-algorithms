package org.milan.datastructure.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Linked list with all basic operations
 *
 * @author Milan Rathod
 */
public class LinkedList<E extends Comparable<E>> {

    /**
     * Logger for logging linked list related logs
     */
    private static final Logger LOG = LoggerFactory.getLogger(LinkedList.class);

    /**
     * Head node
     */
    private Node<E> head;

    /**
     * Size of the linked list
     */
    private int size;

    /**
     * Constructs an empty list
     */
    public LinkedList() {
        head = null;
    }

    /**
     * Constructs an list with head
     */
    public LinkedList(Node<E> head) {
        this.head = head;
        adjustSize(head);
    }

    /**
     * return head of the linked list
     *
     * @return head of the linked list
     */
    public Node<E> getHead() {
        return head;
    }

    /**
     * Insert new node before head node
     *
     * @param data data of the new node to be inserted
     */
    public void insertBeforeHead(E data) {
        if (isEmpty()) {
            head = new Node<>(data);
        } else {
            Node<E> newHead = new Node<>(data, head);
            head = newHead;
        }
        size++;
    }

    /**
     * Insert new node after specified node
     *
     * @param previousNodeKey node after which new node to be inserted
     * @param newNodeKey      data of the new node to be inserted
     */
    public void insertAfterSpecifiedNode(E previousNodeKey, E newNodeKey) {

        // Check if list is empty
        if (isEmpty()) {
            throw new NoSuchElementException("Node with key " + previousNodeKey.toString() + " not found");
        }

        Node<E> current = head;

        // Loop through list until previous node found
        while (current != null && !current.data.equals(previousNodeKey)) {
            current = current.next;
        }

        // If null, previous node not found
        if (current == null) {
            throw new NoSuchElementException("Node with key " + previousNodeKey.toString() + " not found");
        }

        // previous node is found
        Node<E> newNode = new Node<>(newNodeKey, current.next);
        current.next = newNode;
        size++;
    }

    /**
     * Insert new node after specified position
     *
     * @param data     data of the new node to be inserted
     * @param position position after which new node to be inserted
     */
    public void insertAfterSpecifiedPosition(E data, int position) {

        if (position < 0 || position > size - 1) {
            throw new IllegalArgumentException("Position is Invalid");
        }

        Node<E> temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        Node<E> newNode = new Node<>(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    /**
     * Insert new node at the end of list
     *
     * @param data data of the new node to be inserted
     */
    public void insertAtEnd(E data) {
        Node<E> newNode = new Node<>(data);
        // Check if list is empty
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<E> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }

    /**
     * Delete a node by data key
     *
     * @param data data of the new node to be deleted
     */
    public void deleteNodeByKey(E data) {
        Node<E> temp = head;
        Node<E> previous = null;

        // To be deleted node is a head node
        if (temp != null && temp.data == data) {
            head = temp.next;
            size--;
            return;
        }

        // Identify the deletion node
        while (temp != null && temp.data != data) {
            previous = temp;
            temp = temp.next;
        }

        if (temp == null) {
            throw new NoSuchElementException("Requested node for deletion with key " + data + " not found");
        } else {
            previous.next = temp.next;
            size--;
        }
    }

    /**
     * Delete a node by its position
     *
     * @param position position of the node to be deleted
     */
    public void deleteNodeByPosition(int position) {

        if (position < 0 || position > size - 1) {
            throw new IllegalArgumentException("Position is Invalid");
        }

        Node<E> temp = head;

        // To be deleted node is a head node
        if (position == 0) {
            head = head.next;
            size--;
        } else {
            Node<E> previous = temp;

            for (int i = 0; i < position; i++) {
                previous = temp;
                temp = temp.next;
            }

            previous.next = temp.next;
            size--;
        }
    }

    public void printList() {
        printList(head);
    }

    public void printList(Node<E> node) {
        Node<E> temp = node;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Method to find a node on a given index
     *
     * @param index value for which node to be searched
     * @return {@link Node<E>}
     */
    public Node<E> searchByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is Invalid");
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Method to find a node for a given value
     *
     * @param value value for which node to be searched
     * @return {@link Node<E>}
     */
    public Node<E> searchByValue(E value) {
        Node<E> temp = head;
        while (null != temp && temp.data != value) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * return size of the linked list
     *
     * @return linked list size
     */
    public int getSize() {
        return size;
    }

    /**
     * check if linked list is empty or not
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Check if node is present in linked list or not
     */
    public boolean contains(E key) {
        Node<E> current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Calculate size of a linked list - iterative approach
     */
    public int computeSize() {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * Calculate size of a linked list - recursive approach
     */
    public int size(Node<E> head) {
        if (head == null) {
            return 0;
        } else {
            return 1 + size(head.next);
        }
    }

    /**
     * Adjust size of the linked list based on passed head node
     *
     * @param head head of the linked list
     */
    private void adjustSize(Node<E> head) {
        Node<E> current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
    }

    /**
     * Get tail node of linked list
     */
    private Node<E> getTail() {
        Node<E> tail = head;

        while (tail != null && tail.next != null) {
            tail = tail.next;
        }

        return tail;
    }

    /**
     * Sort the given linked list with quick sort algorithm
     */
    public void quickSort() {
        Node<E> tail = getTail();

        quickSortUtil(head, tail);
    }

    private void quickSortUtil(Node<E> start, Node<E> end) {

        // Base case
        if (start == end) {
            return;
        }

        // Split list and partition recursively
        Node<E> prevPivot = partition(start, end);

        quickSortUtil(start, prevPivot);

        // If pivot is picked and moved to start that means start and pivot is same
        // So pick from next of pivot
        if (prevPivot != null && prevPivot == start) {
            quickSortUtil(prevPivot.next, end);
        } else if (prevPivot != null && prevPivot.next != null) {
            // If pivot is in between list start from next of pivot
            // Since we have prev pivot so move two nodes
            quickSortUtil(prevPivot.next.next, end);
        }
    }

    private Node<E> partition(Node<E> start, Node<E> end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node<E> prevPivot = start;
        Node<E> current = start;
        E pivot = end.data;

        while (start != end) {
            if ((start.data.compareTo(pivot) < 0)) {

                // Keep track of last modified item
                prevPivot = current;
                E temp = current.data;
                current.data = start.data;
                start.data = temp;
                current = current.next;
            }
            start = start.next;
        }

        E temp = current.data;
        current.data = pivot;
        end.data = temp;

        // Return one previous to pivot since current is pointing to pivot
        return prevPivot;
    }

    /**
     * Sort the given linked list with merge sort algorithm
     * <p>
     * NOTE: Always prefer merge sort implementation of
     * linked list over quick sort
     */
    public void sort() {
        this.head = sortUtil(head);
    }

    private Node<E> sortUtil(Node<E> newHead) {
        // Base case if linked list is empty or only has one node
        if (newHead == null || newHead.next == null) {
            return newHead;
        }

        // Get the middle of the list
        Node<E> middle = getMiddle(newHead);
        Node<E> nextOfMiddle = middle.next;

        // Set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node<E> left = sortUtil(newHead);

        // Apply mergeSort on right list
        Node<E> right = sortUtil(nextOfMiddle);

        // Merge the left and right lists
        return sortedMerge(left, right);
    }

    /**
     * Merge two sub lists
     *
     * @param left  left sub list
     * @param right right sub list
     * @return head pointer of merged list
     */
    private Node<E> sortedMerge(Node<E> left, Node<E> right) {
        Node<E> result;

        // Base cases
        if (left == null)
            return right;
        if (right == null)
            return left;

        // Pick either a or b and recur
        if (left.data.compareTo(right.data) <= 0) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    /**
     * Get Middle node of the linked list
     */
    public Node<E> getMiddle(Node<E> head) {
        if (head == null)
            return null;

        Node<E> slow = head;
        Node<E> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Convert linked list to array
     * <p>
     * TODO can we remove input parameter here?
     *
     * @param classE type parameter class
     * @return array of type elements
     */
    public E[] toArray(Class<E> classE) {
        E[] array = (E[]) Array.newInstance(classE, getSize());
        int index = 0;
        Node<E> temp = head;
        while (temp != null) {
            array[index++] = temp.data;
            temp = temp.next;
        }
        return array;
    }

    public static class Node<E extends Comparable<E>> implements Comparable<E> {
        E data;

        Node<E> next;

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(data, node.data) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public int compareTo(E o) {
            return getData().compareTo(o);
        }
    }
}
