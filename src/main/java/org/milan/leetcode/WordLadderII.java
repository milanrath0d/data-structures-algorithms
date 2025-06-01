package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/word-ladder-ii/">...</a>}
 * <p>
 *
 * @author Milan Rathod
 */
public class WordLadderII {

    /**
     * Finds all shortest transformation sequences from the start word to the end word
     * using the words in the given word list, where each transformation must be a valid word
     * and change only one character at a time.
     *
     * @param start    the starting word
     * @param end      the target word
     * @param wordList the list of available words to use for transformations
     * @return a list of lists, where each list represents one of the shortest transformation sequences
     */
    public List<List<String>> findLadders(String start, String end, List<String> wordList) {
        List<List<String>> results = new ArrayList<>();
        if (wordList.isEmpty()) {
            return results;
        }

        int min = Integer.MAX_VALUE;

        Queue<String> queue = new ArrayDeque<>();
        queue.add(start);

        Map<String, List<String>> map = new HashMap<>();

        Map<String, Integer> ladder = new HashMap<>();
        for (String string : wordList) {
            ladder.put(string, Integer.MAX_VALUE);
        }
        ladder.put(start, 0);

        wordList.add(end);

        //BFS: Dijkstra search
        while (!queue.isEmpty()) {

            String word = queue.poll();

            // 'step' indicates how many steps are needed to travel to one word.
            int step = ladder.get(word) + 1;

            if (step > min) {
                break;
            }

            for (int i = 0; i < word.length(); i++) {
                StringBuilder builder = new StringBuilder(word);
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    builder.setCharAt(i, ch);
                    String new_word = builder.toString();
                    if (ladder.containsKey(new_word)) {

                        // Check if it is the shortest path to one word.
                        if (step > ladder.get(new_word)) {
                            continue;
                        } else if (step < ladder.get(new_word)) {
                            queue.add(new_word);
                            ladder.put(new_word, step);
                        }
                        // It is a KEY line. If one word already appeared in one ladder,
                        // Do not insert the same word inside the queue twice. Otherwise it gets TLE.

                        //Build adjacent Graph
                        if (map.containsKey(new_word)) {
                            map.get(new_word).add(word);
                        } else {
                            List<String> list = new LinkedList<>();
                            list.add(word);
                            map.put(new_word, list);
                            //It is possible to write three lines in one:
                            //map.put(new_word,new LinkedList<String>(Arrays.asList(new String[]{word})));
                            //Which one is better?
                        }

                        if (new_word.equals(end)) {
                            min = step;
                        }

                    } // End if dict contains new_word
                } // End:Iteration from 'a' to 'z'
            } // End:Iteration from the first to the last
        } // End While

        //BackTracking
        LinkedList<String> result = new LinkedList<>();
        backTrace(end, start, result, results, map);

        return results;
    }

    private void backTrace(String word, String start, List<String> list, List<List<String>> results, Map<String, List<String>> map) {
        if (word.equals(start)) {
            list.addFirst(start);
            results.add(new ArrayList<>(list));
            list.removeFirst();
            return;
        }
        list.addFirst(word);
        if (map.get(word) != null) {
            for (String s : map.get(word)) {
                backTrace(s, start, list, results, map);
            }
        }

        list.removeFirst();
    }

}
