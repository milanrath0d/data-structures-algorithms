package org.milan.datastructure.tree;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/}
 *
 * @author Milan Rathod
 */
public class LowestCommonAncestor {

    /**
     * Find LCA of two given nodes
     *
     * @param root  root of the binary tree
     * @param node1 first node
     * @param node2 second node
     * @return lowest common ancestor of given two nodes
     */
    public Node<Integer> findLCA(Node<Integer> root, int node1, int node2) {
        // Base condition
        if (root == null) {
            return null;
        }

        if (root.key == node1 || root.key == node2) {
            return root;
        }

        Node<Integer> leftLca = findLCA(root.left, node1, node2);
        Node<Integer> rightLca = findLCA(root.right, node1, node2);

        // If both left and right lca returns non-null then one key
        // is present in left subtree and one key is present in right subtree
        // so current node is LCA
        if (leftLca != null && rightLca != null) {
            return root;
        }

        // Otherwise check if left subtree or right subtree is LCA
        return leftLca != null ? leftLca : rightLca;
    }
}
