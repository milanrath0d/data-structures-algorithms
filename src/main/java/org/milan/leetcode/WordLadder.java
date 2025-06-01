package org.milan.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/word-ladder/description/">Word Ladder Problem</a>}
 * <p>
 * Problem: Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest
 * transformation sequence from beginWord to endWord, such that:
 * 1. Only one letter can be changed at a time.
 * 2. Each transformed word must exist in the word list.
 * <p>
 * Note:
 * - Return 0 if there is no such transformation sequence.
 * - All words have the same length.
 * - All words contain only lowercase alphabetic characters.
 * - You may assume no duplicates in the word list.
 * - You may assume beginWord and endWord are non-empty and are not the same.
 *
 * @author Milan Rathod
 */
public class WordLadder {

    /**
     * Find the length of shortest transformation sequence
     *
     * @param beginWord starting word
     * @param endWord   target word
     * @param wordList  dictionary of words
     * @return length of shortest transformation sequence
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int length = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return length;
                }

                for (int j = 0; j < word.length(); j++) {
                    char[] charArray = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (charArray[j] == c) {
                            continue;
                        }
                        charArray[j] = c;
                        String newWord = new String(charArray);
                        if (wordSet.contains(newWord)) {
                            wordSet.remove(newWord);
                            queue.add(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
            length++;
        }

        return 0;
    }

    /**
     * Finds the length of the shortest transformation sequence from the start word
     * to the end word, changing only one letter at a time, while each word in the sequence
     * must exist in the given word list.
     *
     * @param beginWord the starting word
     * @param endWord   the target word
     * @param wordList  the set of valid words that can be used for the transformation
     * @return the length of the shortest transformation sequence, or 0 if no such sequence exists
     */
    public int ladderLengthV2(String beginWord, String endWord, Set<String> wordList) {
        // If beginWord equals endWord, return 1
        if (beginWord.equals(endWord)) {
            return 1;
        }

        // If endWord is not in wordList, return 0
        if (!wordList.contains(endWord)) {
            return 0;
        }

        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();

        int len = 1;
        HashSet<String> visited = new HashSet<>();

        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }

            Set<String> temp = new HashSet<>();
            for (String word : beginSet) {
                char[] chs = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);

                        if (endSet.contains(target)) {
                            return len + 1;
                        }

                        if (!visited.contains(target) && wordList.contains(target)) {
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }

            beginSet = temp;
            len++;
        }

        return 0;
    }
}
