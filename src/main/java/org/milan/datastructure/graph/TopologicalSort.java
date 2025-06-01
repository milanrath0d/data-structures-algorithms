package org.milan.datastructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem: {@link @<a href="https://www.geeksforgeeks.org/topological-sorting/">...</a>}
 *
 * @author Milan Rathod
 */
public class TopologicalSort {

    /**
     * Sorts the vertices of a directed graph in topological order using Depth First Search (DFS).
     * <p>
     * Time Complexity: O(V+E)
     *
     * @param vertex the number of vertices in the graph
     * @param edges  the adjacency representation of the edges in the graph,
     *               where each sub-array contains two integers [source, destination]
     *               representing a directed edge from source to destination
     * @return a list of integers representing the topological order of the vertices
     */
    public List<Integer> sort(int vertex, int[][] edges) {
        Graph graph = new Graph(vertex);

        for (int[] edge : edges) {
            graph.addEdge(graph, edge[0], edge[1]);
        }

        Stack<Integer> stack = new Stack<>();

        boolean[] visited = new boolean[graph.getSize()];

        // Visit all nodes recursively and call visit function
        // to store topological order
        for (int i = 0; i < graph.getSize(); i++) {
            if (!visited[i]) {
                visit(i, visited, graph, stack);
            }
        }

        List<Integer> outputList = new ArrayList<>();

        while (!stack.isEmpty()) {
            outputList.add(stack.pop());
        }

        return outputList;
    }

    /**
     * Utility function to visit all vertices in topological order
     *
     * @param v       vertex
     * @param visited array storing status of visited vertices
     * @param stack   used for storing vertices
     */
    private void visit(int v, boolean[] visited, Graph graph, Stack<Integer> stack) {

        // Mark the current node as visited
        visited[v] = true;

        // Get all adjacent vertices
        List<Integer> neighbours = graph.getAdjList()[v];

        // Visit all adjacent vertices if visited flag is false
        for (Integer i : neighbours) {
            if (!visited[i]) {
                visit(i, visited, graph, stack);
            }
        }

        // Push current vertex to stack to store result
        stack.push(v);
    }
}
