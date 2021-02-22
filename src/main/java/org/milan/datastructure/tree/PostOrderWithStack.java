package org.milan.datastructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Refer {@link @https://www.geeksforgeeks.org/iterative-postorder-traversal/}
 * Refer {@link @https://www.geeksforgeeks.org/iterative-postorder-traversal-using-stack/}
 *
 * @author Milan Rathod
 */
public class PostOrderWithStack {

    public List<Integer> postOrderWithTwoStacks(Node<Integer> root) {
        List<Integer> outputList = new ArrayList<>();
        Stack<Node<Integer>> stack1 = new Stack<>();
        Stack<Node<Integer>> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node<Integer> temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) stack1.push(temp.left);
            if (temp.right != null) stack1.push(temp.right);
        }
        while (!stack2.isEmpty()) {
            outputList.add(stack2.pop().key);
        }

        return outputList;
    }

    public List<Integer> postOrderWithOneStack(Node<Integer> root) {
        List<Integer> outputList = new ArrayList<>();

        Stack<Node<Integer>> stack = new Stack<>();
        do {
            while (root != null) {
                if (root.right != null) stack.push(root.right);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right != null && (!stack.isEmpty() && root.right == stack.peek())) {
                Node<Integer> temp = stack.pop();
                stack.push(root);
                root = temp;
            } else {
                outputList.add(root.key);
                root = null;
            }
        } while (!stack.isEmpty());
        return outputList;
    }

}
