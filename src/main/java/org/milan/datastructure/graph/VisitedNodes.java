package org.milan.datastructure.graph;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

/**
 * Problem: Visited Nodes
 * <p>
 * You are given an undirected graph that contains N+1 nodes and M edges.
 * These nodes are numbered from 0 to N.
 * Initially, you start at node 0.
 * Each node (except node 0) has a priority associated with it that is denoted by the array denoted as P.
 * You have to follow these commands to visit each node in the path:
 * <p>
 * 1. You have to start at node 0 and move to the next unvisited node which is directly connected to
 * node 0 and having the highest priority.
 * 2. If the priority is the same for multiple nodes, then you have to select the nodes that have the
 * minimum distance between them.
 * 3. After going to the next node, you have to again select a connected node that has the highest priority
 * among the remaining nodes.
 * 4. If there are no adjacent unvisited node at a point, then you have to traverse back to the previous node
 * from where you came to the present node for the first time.
 * 5. You cannot traverse the path once you reach the last unvisited node.
 * <p>
 * If the distance between the node x to node y is d, then the time elapsed to reach from one node to another is  d units.
 * Your task is to find the time required to arrive at each node (except node 0) for the first time.
 * <p>
 * Note: The given graph is a connected graph and no two nodes have the same values for priority and distance.
 * <p>
 * <b>Input format</b>
 * First line: Two space-separated integers denoted as N and M.
 * Next line: N space-separated integers, denoting the priorities Pi associated with the nodes
 * Next M lines: Three space-separated integers denoted as u, v, and d. Each of these integers denote that u and v are the
 * cities that are directly connected through the road that has distance d from the cities.
 * <b>Output format</b>
 * <p>
 * Print N space-separated integers denoting the time taken to arrive at each node (except node 0) for the first time.
 *
 * @author Milan Rathod
 */
public class VisitedNodes {

    /**
     * @param N          N nodes excluding 0th node
     * @param M          M edges
     * @param priorities array of integers includes priority of each node
     * @param edges      2D array of edges each edge consists of three parts
     *                   {0,1,7} -> {src, dest, weight/distance}
     * @return
     */
    public int[] find(int N, int M, int[] priorities, int[][] edges) {
        LinkedList<Edge>[] adj = new LinkedList[N + 1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }

        for (int i = 0; i < M; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            adj[src].add(new Edge(dest, priorities[dest], weight));
            adj[dest].add(new Edge(src, priorities[src], weight));
        }

        for (int i = 0; i <= N; i++) {
            adj[i].sort((o1, o2) -> o1.priority != o2.priority ? o2.priority - o1.priority : o1.distance - o2.distance);
        }

        int current = 0;
        int navigate = 0;
        int total = 0;

        Stack<Pair<Integer, Edge>> stack = new Stack<>();

        // Visited array to keep track of which nodes are already visited
        boolean[] visited = new boolean[N + 1];

        // Marked source node i.e. 0th node as visited
        visited[0] = true;

        // Output array which will eventually includes optimal distance from 0th node to each node
        int[] output = new int[N];

        // Loop till all nodes are visited
        while (navigate < N) {
            int curr1 = current;

            // All edges are visited for current node?
            while (!adj[current].isEmpty()) {
                if (!visited[adj[current].getFirst().dest]) {
                    stack.push(ImmutablePair.of(current, adj[current].getFirst()));
                    total += adj[current].getFirst().distance;
                    current = adj[current].getFirst().dest;
                    output[current - 1] = total;
                    navigate++;
                    visited[current] = true;
                    adj[curr1].removeFirst();
                    break;
                } else {
                    adj[current].removeFirst();
                }
            }

            if (curr1 == current) {
                current = stack.peek().getKey();
                total += stack.peek().getValue().distance;
                stack.pop();
            }
        }

        return output;
    }

    static class Edge {
        int dest;
        int priority;
        int distance;

        Edge(int dest, int priority, int weight) {
            this.dest = dest;
            this.priority = priority;
            this.distance = weight;
        }

        @Override
        public String toString() {
            return "[ " + dest + " , " + priority + " , " + distance + " ]";
        }
    }

}
