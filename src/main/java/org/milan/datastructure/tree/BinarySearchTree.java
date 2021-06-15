package org.milan.datastructure.tree;

import java.util.*;

/**
 * Implementation of binary search tree with all use cases
 *
 * @author Milan Rathod
 */
public class BinarySearchTree<T extends Comparable<T>> {

    public static final String EMPTY_TREE = "Tree is empty";

    /**
     * Root of the binary search tree
     */
    private Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(Node<T> root) {
        this.root = root;
    }

    public BinarySearchTree(T key) {
        this.root = new Node<>(key);
    }

    /**
     * Get Root of the binary search tree
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * Insert a node to binary search tree
     *
     * @param key node key
     */
    public void insert(T key) {
        root = insertRec(root, key);
    }

    /**
     * Recursively insert node key into binary search tree
     *
     * @param root root of the tree
     * @param key  node key
     * @return root
     */
    private Node<T> insertRec(Node<T> root, T key) {
        if (root == null) {
            root = new Node<>(key);
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    /**
     * Delete a node from binary search tree
     *
     * @param key node key to be deleted
     */
    public void delete(T key) {
        root = deleteRec(root, key);
    }

    /**
     * Delete a node from binary search tree recursively
     *
     * @param root root of the tree
     * @param key  node key
     * @return root
     */
    private Node<T> deleteRec(Node<T> root, T key) {

        // Base condition
        if (root == null) {
            return null;
        }

        if (key.compareTo(root.key) < 0) {
            root.left = deleteRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            // Find in order predecessor of node to be deleted
            root = root.left.right;

            // Delete the in order predecessor
            root.left = deleteRec(root.left, key);
        }

        return root;
    }

    /**
     * check if node with given key is present in tree
     *
     * @param root root of the tree
     * @param key  node key
     * @return true if present otherwise false
     */
    public boolean isPresent(Node<T> root, T key) {
        if (root.key == key) {
            return true;
        } else if (root.key.compareTo(key) < 0) {
            return isPresent(root.right, key);
        } else {
            return isPresent(root.left, key);
        }
    }

    /**
     * Pre order traversal of a tree using recursion
     *
     * @param root root of a tree
     */
    public List<T> preOrder(Node<T> root) {
        List<T> outputList = new LinkedList<>();
        preOrderUtil(root, outputList);
        return outputList;
    }

    /**
     * Utility function which will actually do pre order
     *
     * @param root root of a tree
     * @param list list to return pre order result
     */
    private void preOrderUtil(Node<T> root, List<T> list) {
        if (root != null) {
            // Visit the root and append it to string builder
            list.add(root.key);

            // Traverse left subtree
            preOrderUtil(root.left, list);

            // Traverse right subtree
            preOrderUtil(root.right, list);
        }
    }

    /**
     * Pre order traversal of a tree using iterative approach
     *
     * @param root root of a tree
     */
    public List<T> preOrderIterative(Node<T> root) {
        List<T> outputList = new LinkedList<>();

        Deque<Node<T>> stack = new ArrayDeque<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            Node<T> temp = stack.pop();

            // add it to output
            outputList.add(temp.key);

            // First push right and then left child of current popped item
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

        return outputList;
    }

    /**
     * In order traversal of a tree using recursion
     *
     * @param root root of a tree
     */
    public List<T> inOrder(Node<T> root) {
        List<T> outputList = new LinkedList<>();
        inOrderUtil(root, outputList);
        return outputList;
    }

    /**
     * Utility function which will actually do in order
     *
     * @param root root of a tree
     * @param list list to return in order result
     */
    private void inOrderUtil(Node<T> root, List<T> list) {
        if (root != null) {
            // Traverse left subtree
            inOrderUtil(root.left, list);

            // Visit the root and append it to list
            list.add(root.key);

            // Traverse right subtree
            inOrderUtil(root.right, list);
        }
    }

    /**
     * In order traversal of a tree using iterative approach
     *
     * @param root root of a tree
     */
    public List<T> inOrderIterative(Node<T> root) {
        List<T> outputList = new LinkedList<>();

        Deque<Node<T>> stack = new ArrayDeque<>();

        // Boolean flag to indicate when to exit while loop i.e. tree traversal is complete
        boolean done = false;

        Node<T> current = root;

        while (!done) {

            if (current != null) {
                stack.push(current);

                current = current.left;
            } else {
                if (stack.isEmpty()) {
                    done = true;
                } else {
                    Node<T> temp = stack.pop();

                    // add it to output
                    outputList.add(temp.key);

                    current = temp.right;
                }

            }
        }
        return outputList;
    }

    /**
     * Post order traversal of a tree using recursion
     *
     * @param root root of a tree
     */
    public List<T> postOrder(Node<T> root) {
        List<T> outputList = new LinkedList<>();
        postOrderUtil(root, outputList);
        return outputList;
    }

    /**
     * Utility function which will actually do post order
     *
     * @param root root of a tree
     * @param list list to return post order result
     */
    private void postOrderUtil(Node<T> root, List<T> list) {
        if (root != null) {
            // Traverse left subtree
            postOrderUtil(root.left, list);

            // Traverse right subtree
            postOrderUtil(root.right, list);

            // Visit the root and append it to list
            list.add(root.key);
        }
    }

    /**
     * Post order traversal of a tree using iterative approach
     *
     * @param root root of a tree
     */
    public List<T> postOrderIterative(Node<T> root) {
        List<T> outputList = new LinkedList<>();

        Deque<Node<T>> stack = new ArrayDeque<>();

        stack.push(root);

        Node<T> prev = null;

        while (!stack.isEmpty()) {

            Node<T> curr = stack.peek();

            // Traverse from top to bottom and if current has left/right child add it to stack
            if (prev == null || prev.left == curr || prev.right == curr) {

                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }

            } else if (curr.left == prev) {
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else {
                outputList.add(stack.pop().key);
            }
            prev = curr;
        }
        return outputList;
    }

    /**
     * Level order traversal of a tree using iterative approach
     *
     * @param root root of the tree
     */
    public List<T> levelOrder(Node<T> root) {

        // Base condition
        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        List<T> outputList = new LinkedList<>();

        Queue<Node<T>> queue = new LinkedList<>();

        Node<T> temp = root;

        queue.offer(temp);

        while (!queue.isEmpty()) {

            temp = queue.poll();

            outputList.add(temp.key);

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return outputList;
    }

    /**
     * Level order traversal of a tree in reverse
     *
     * @param root root of the tree
     */
    public List<T> levelOrderReverse(Node<T> root) {

        // Base condition
        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        List<T> outputList = new LinkedList<>();

        Queue<Node<T>> queue = new LinkedList<>();

        Deque<Node<T>> stack = new ArrayDeque<>();

        Node<T> temp = root;

        queue.offer(temp);

        while (!queue.isEmpty()) {
            temp = queue.poll();
            stack.push(temp);

            if (temp.right != null) {
                queue.add(temp.right);
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }
        }

        while (!stack.isEmpty()) {
            outputList.add(stack.pop().key);
        }
        return outputList;
    }

    /**
     * Least common ancestor (LCA) of two nodes
     * NOTES: assumption is both the nodes are present in tree
     *
     * @param root  root of the tree
     * @param node1 first node
     * @param node2 second node
     * @return LCA of two nodes
     */
    public Node<T> lca(Node<T> root, T node1, T node2) {
        // Base condition
        if (root == null) {
            return null;
        }

        // If value of both the nodes are less than current node value traverse left
        if (root.key.compareTo(node1) > 0 && root.key.compareTo(node2) > 0) {
            return lca(root.left, node1, node2);
        }

        // If value of both the nodes are greater than current node value traverse right
        if (root.key.compareTo(node1) < 0 && root.key.compareTo(node2) < 0) {
            return lca(root.right, node1, node2);
        }
        return root;
    }

    /**
     * Find node with minimum value of binary search tree
     *
     * @param root root of the tree
     * @return Node with minimum value; null for empty bst
     */
    public Node<T> findMin(Node<T> root) {
        return root == null || root.left == null ? root : findMin(root.left);
    }

    /**
     * Find node with maximum of binary search tree
     *
     * @param root root of the tree
     * @return Node with maximum value; null for empty bst
     */
    public Node<T> findMax(Node<T> root) {
        return root == null || root.right == null ? root : findMax(root.right);
    }

    /**
     * Find minimum depth of the binary tree
     *
     * @param root root of the tree
     * @return height of the tree
     */
    public int minimumDepth(Node<T> root) {

        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        int minDepth = 1;

        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);

        // Used for separating elements in level order
        queue.offer(null);

        while (!queue.isEmpty()) {

            Node<T> curr = queue.poll();

            if (curr != null) {
                if (curr.left == null && curr.right == null) {
                    return minDepth;
                }

                if (curr.left != null) queue.offer(curr.left);

                if (curr.right != null) queue.offer(curr.right);
            } else {
                if (!queue.isEmpty()) {
                    minDepth++;
                    queue.offer(null);
                }
            }
        }
        return minDepth;
    }

    /**
     * Find deepest node binary tree
     *
     * @param root root of the tree
     * @return deepest node
     */
    public Node<T> findDeepestNode(Node<T> root) {

        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);

        Node<T> curr = null;

        while (!queue.isEmpty()) {

            curr = queue.poll();

            if (curr.left != null) {
                queue.offer(curr.left);
            }

            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return curr;
    }

    /**
     * Calculate size of tree
     *
     * @param root root of the tree
     * @return total size
     */
    public int size(Node<T> root) {
        if (root == null) return 0;

        return size(root.left) + size(root.right) + 1;
    }

    /**
     * Calculate size of tree
     * Iterative approach
     *
     * @param root root of the tree
     * @return total size
     */
    public int sizeIterative(Node<T> root) {
        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        Queue<Node<T>> queue = new LinkedList<>();

        Node<T> temp = root;

        queue.offer(temp);

        int size = 0;

        while (!queue.isEmpty()) {

            temp = queue.poll();

            size++;

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return size;
    }

    /**
     * Find maximum width of the binary tree
     *
     * @param root root of the tree
     * @return maximum width of the tree
     */
    public int maximumWidth(Node<T> root) {

        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        int currentWidth = 0;

        int maxWidth = 1;

        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);

        // Used for separating elements in level order
        queue.offer(null);

        while (!queue.isEmpty()) {

            Node<T> curr = queue.poll();

            if (curr != null) {
                if (curr.left != null) {
                    queue.offer(curr.left);
                    currentWidth++;
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                    currentWidth++;
                }
            } else {
                if (!queue.isEmpty()) {
                    currentWidth = 0;
                    queue.offer(null);
                }
            }

            if (currentWidth > maxWidth) {
                maxWidth = currentWidth;
            }
        }
        return maxWidth;
    }

    /**
     * Find in order successor of given node
     *
     * @param root root of the binary tree
     * @param node node for which in order successor to be found
     * @return in order successor of given node
     */
    public Node<T> inOrderSuccessor(Node<T> root, Node<T> node) {
        // If right subtree of the node is not NULL
        // go to right subtree and return node with minimum key
        if (node.right != null) {
            Node<T> current = node.right;

            while (current.left != null) {
                current = current.left;
            }

            return current;
        }

        Node<T> successor = null;

        // Start from root and search for successor down the tree
        while (root != null) {
            if (node.key.compareTo(root.key) < 0) {
                successor = root;
                root = root.left;
            } else if (node.key.compareTo(root.key) > 0)
                root = root.right;
            else
                break;
        }

        return successor;
    }

    /**
     * Find in order predecessor of given node
     *
     * @param root root of the binary tree
     * @param node node for which in order predecessor to be found
     * @return in order predecessor of given node
     */
    public Node<T> inOrderPredecessor(Node<T> root, Node<T> node) {
        // If right subtree of the node is not NULL
        // go to right subtree and return node with minimum key
        if (node.left != null) {
            Node<T> current = node.left;

            while (current.right != null) {
                current = current.right;
            }

            return current;
        }

        Node<T> predecessor = null;

        // Start from root and search for predecessor down the tree
        while (root != null) {
            if (node.key.compareTo(root.key) > 0) {
                predecessor = root;
                root = root.right;
            } else if (node.key.compareTo(root.key) < 0)
                root = root.left;
            else
                break;
        }

        return predecessor;
    }

}
