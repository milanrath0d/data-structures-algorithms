package org.milan.datastructure.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Linked list with all basic operations
 *
 * @author Milan Rathod
 */
public class LinkedList<E> {
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
     * @param index
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
     * @param value
     * @return {@link Node<E>}
     */
    public Node<E> searchByValue(E value) {
        Node<E> temp = head;
        while (null != temp && temp.data != value) {
            temp = temp.next;
        }
        if (temp.data == value) {
            return temp;
        }
        return null;
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

    public static class Node<E> {
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
    }
}
