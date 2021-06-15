package org.milan.datastructure.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: refer {@link @https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/}
 *
 * @author Milan Rathod
 */
public class BinaryTreeFromInOrderAndPreOrder {

    private int preIndex = 0;

    /**
     * Construct binary tree from given in order and pre order traversals
     * <p>
     * Time complexity: O(N*N)
     * Space complexity: O(1)
     *
     * @param inOrder  character array of in order traversal
     * @param preOrder character array of pre order traversal
     * @return root of constructed binary tree
     */
    public TreeNode<Character> buildTree(char[] inOrder, char[] preOrder) {
        if (inOrder.length == 0 || inOrder.length != preOrder.length) {
            throw new IllegalArgumentException("Given inorder and preorder traversal is incorrect");
        }
        return buildRecursive(inOrder, preOrder, 0, inOrder.length - 1);
    }

    /**
     * Recursive function to create binary tree from in order and pre order traversals
     *
     * @param inOrder  character array of in order traversal
     * @param inStart  start index of in order traversal array
     * @param inEnd    end index of in order traversal array
     * @param preOrder character array of pre order traversal
     * @return root of constructed binary tree
     */
    private TreeNode<Character> buildRecursive(char[] inOrder, char[] preOrder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        char data = preOrder[preIndex++];

        TreeNode<Character> current = new TreeNode<>(data);

        // If this node has no children then return
        if (inStart == inEnd) return current;

        int inIndex = search(inOrder, inStart, inEnd, data);

        current.left = buildRecursive(inOrder, preOrder, inStart, inIndex - 1);
        current.right = buildRecursive(inOrder, preOrder, inIndex + 1, inEnd);

        return current;
    }

    private int search(char[] arr, int start, int end, int data) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid traversal combination");
    }

    /**
     * Construct binary tree from given in order and pre order traversals using Hashmap
     * <p>
     * Time complexity: O(N)
     * Space complexity: O(N)
     *
     * @param inOrder  character array of in order traversal
     * @param preOrder character array of pre order traversal
     * @return root of constructed binary tree
     */
    public TreeNode<Character> buildTreeV2(char[] inOrder, char[] preOrder) {
        if (inOrder.length == 0 || inOrder.length != preOrder.length) {
            throw new IllegalArgumentException("Given inorder and preorder traversal is incorrect");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        return buildRecursiveUsingHashMap(preOrder, map, 0, 0, inOrder.length - 1);
    }

    /**
     * Recursive function to create binary tree from in order and pre order traversals
     *
     * @param inStart  start index of in order traversal array
     * @param inEnd    end index of in order traversal array
     * @param preOrder character array of pre order traversal
     * @param index    current index
     * @param map      map used for getting index of inorder traversal array
     * @return root of constructed binary tree
     */
    private TreeNode<Character> buildRecursiveUsingHashMap(char[] preOrder,
                                                           Map<Character, Integer> map,
                                                           int index,
                                                           int inStart, int inEnd) {
        char data = preOrder[index];

        int inMid = map.get(data);

        TreeNode<Character> root = new TreeNode<>(data);

        if (inMid > inStart) {
            root.left = buildRecursiveUsingHashMap(preOrder, map, index + 1, inStart, inMid - 1);
        }

        if (inMid < inEnd) {
            root.right = buildRecursiveUsingHashMap(preOrder, map,
                    index + inMid - inStart + 1, inMid + 1, inEnd);
        }

        return root;
    }

}
