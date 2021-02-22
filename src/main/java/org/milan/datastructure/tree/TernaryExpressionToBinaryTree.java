package org.milan.datastructure.tree;

import java.util.Stack;

/**
 * Refer {@link @https://www.geeksforgeeks.org/convert-ternary-expression-binary-tree/}
 * Refer {@link @https://stackoverflow.com/questions/28487831/how-to-convert-a-ternary-expression-to-a-binary-tree-structure}
 *
 * @author Milan Rathod
 */
public class TernaryExpressionToBinaryTree {

    public Node<Character> convert(String expression) {
        // Base case
        if (expression.length() == 0) {
            return null;
        }

        Node<Character> root = new Node<>(expression.charAt(0));

        Stack<Node<Character>> stack = new Stack<>();

        stack.push(root);

        for (int i = 1; i < expression.length(); i++) {
            if (expression.charAt(i) == '?') {
                Node<Character> node = stack.peek();
                node.left = new Node<>(expression.charAt(i + 1));
                stack.push(node.left);
            } else if (expression.charAt(i) == ':') {
                stack.pop();
                Node<Character> node = stack.pop();
                node.right = new Node<>(expression.charAt(i + 1));
                stack.push(node.right);
            }
        }

        return root;
    }

}
