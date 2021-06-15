package org.milan.leetcode;

import java.util.*;

/**
 * Refer {@link @https://leetcode.com/problems/open-the-lock/}
 *
 * @author Milan Rathod
 */
public class OpenTheLock {

    public int openLock(String[] deadEnds, String target) {

        // Starting point
        String source = "0000";

        // visited set used for storing deadEnds and visited nodes
        Set<String> visited = new HashSet<>(Arrays.asList(deadEnds));

        Queue<String> queue = new LinkedList<>();

        // If source is part of deadEnds return -1
        if (visited.contains(source))
            return -1;

        visited.add(source);

        queue.add(source);

        int minTurns = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            minTurns++;

            for (int i = 0; i < size; i++) {
                String currentConfiguration = queue.remove();

                for (String neighbor : generateNeighbors(currentConfiguration)) {
                    if (neighbor.equals(target)) {
                        return minTurns;
                    }

                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return -1;
    }

    private List<String> generateNeighbors(String configuration) {

        List<String> totalNeighbors = new ArrayList<>();

        // 8 neighbours are possible
        for (int i = 0; i < configuration.length(); ++i) {

            int digit = configuration.charAt(i) - '0';

            int nextDigit = (digit == 9) ? 0 : digit + 1;
            int prevDigit = (digit == 0) ? 9 : digit - 1;

            String nextConfig = configuration.substring(0, i) + nextDigit + configuration.substring(i + 1, 4);
            String prevConfig = configuration.substring(0, i) + prevDigit + configuration.substring(i + 1, 4);

            totalNeighbors.add(nextConfig);
            totalNeighbors.add(prevConfig);
        }

        return totalNeighbors;
    }
}
