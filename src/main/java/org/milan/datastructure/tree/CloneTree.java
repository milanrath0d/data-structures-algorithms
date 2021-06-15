package org.milan.datastructure.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Refer {@link @https://www.geeksforgeeks.org/clone-binary-tree-random-pointers/}
 *
 * @author Milan Rathod
 */
public class CloneTree {

    /**
     * Clone a given binary tree using hash map
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root root of the binary tree
     * @return root of cloned binary tree
     */
    public RandomNode<Integer> cloneUsingHashMap(RandomNode<Integer> root) {
        Map<RandomNode<Integer>, RandomNode<Integer>> map = new HashMap<>();
        RandomNode<Integer> newRoot = copyLeftRightPointers(root, map);
        copyRandom(root, newRoot, map);
        return newRoot;
    }

    private void copyRandom(RandomNode<Integer> root,
                            RandomNode<Integer> clonedNode,
                            Map<RandomNode<Integer>, RandomNode<Integer>> map) {
        if (clonedNode == null) {
            return;
        }

        clonedNode.random = map.get(root.random);
        copyRandom(root.left, clonedNode.left, map);
        copyRandom(root.right, clonedNode.right, map);
    }

    private RandomNode<Integer> copyLeftRightPointers(RandomNode<Integer> root,
                                                      Map<RandomNode<Integer>, RandomNode<Integer>> map) {
        if (root == null) {
            return null;
        }

        RandomNode<Integer> newNode = new RandomNode<>(root.key);
        map.put(root, newNode);

        newNode.left = copyLeftRightPointers(root.left, map);
        newNode.right = copyLeftRightPointers(root.right, map);

        return newNode;
    }

    /**
     * Tree node with left, right and random pointers
     *
     * @param <T> generic type
     */
    static class RandomNode<T> {
        T key;

        RandomNode<T> left;

        RandomNode<T> right;

        RandomNode<T> random;

        public RandomNode(T key) {
            this.key = key;
            left = right = random = null;
        }
    }

}
