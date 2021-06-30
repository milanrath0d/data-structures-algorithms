package org.milan.datastructure.trie;

/**
 * Refer {@link @https://leetcode.com/problems/implement-trie-prefix-tree/}
 *
 * @author Milan Rathod
 */
public class Trie {

    private final Node root;

    public Trie() {
        this.root = new Node('\0');
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children[ch - 'a'] == null) {
                curr.children[ch - 'a'] = new Node(ch);
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);

        return node != null && node.isWord;
    }

    public boolean startsWith(String pattern) {
        return getNode(pattern) != null;
    }

    private Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children[ch - 'a'] == null) {
                return null;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr;
    }

    static class Node {
        char ch;

        boolean isWord;

        final Node[] children;

        public Node(char ch) {
            this.ch = ch;
            this.isWord = false;
            children = new Node[26];
        }
    }
}
