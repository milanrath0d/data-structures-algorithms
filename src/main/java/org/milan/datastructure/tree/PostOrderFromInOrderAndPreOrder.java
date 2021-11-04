package org.milan.datastructure.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/print-postorder-from-given-inorder-and-preorder-traversals/}
 *
 * @author Milan Rathod
 */
public class PostOrderFromInOrderAndPreOrder {

    public List<Integer> get(int[] pre, int[] in) {
        List<Integer> outputList = new ArrayList<>();

        postOrder(in, pre, in.length, outputList);

        return outputList;
    }

    private void postOrder(int[] in, int[] pre, int n, List<Integer> list) {

        // First element in pre[] is always root, search it in in[]
        // to find left and right subtrees
        int root = search(in, pre[0], n);

        // If left subtree is not empty, recur left subtree
        if (root != 0)
            postOrder(in, Arrays.copyOfRange(pre, 1, n), root, list);

        // If right subtree is not empty, recur right subtree
        if (root != n - 1)
            postOrder(Arrays.copyOfRange(in, root + 1, n),
                Arrays.copyOfRange(pre, root + 1, n), n - root - 1, list);

        list.add(pre[0]);
    }

    private int search(int[] arr, int x, int n) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }
}
