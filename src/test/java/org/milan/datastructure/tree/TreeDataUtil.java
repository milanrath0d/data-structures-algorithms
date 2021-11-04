package org.milan.datastructure.tree;

import java.util.List;

/**
 * @author Milan Rathod
 */
public final class TreeDataUtil {

    private TreeDataUtil() {

    }

    public static BinaryTree<Integer> initialize() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(1);
        binaryTree.getRoot().left = new Node<>(2);
        binaryTree.getRoot().right = new Node<>(3);
        binaryTree.getRoot().left.left = new Node<>(4);
        binaryTree.getRoot().left.right = new Node<>(5);
        binaryTree.getRoot().right.left = new Node<>(6);
        binaryTree.getRoot().right.right = new Node<>(7);
        return binaryTree;
    }

    public static BinarySearchTree<Integer> initializeBST() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(20);

        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(5);
        binarySearchTree.insert(30);
        binarySearchTree.insert(35);
        binarySearchTree.insert(25);

        return binarySearchTree;
    }

    public static int[] toArray(List<Integer> list) {
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
