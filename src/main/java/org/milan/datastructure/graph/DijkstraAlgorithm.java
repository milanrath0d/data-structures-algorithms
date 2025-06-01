package org.milan.datastructure.graph;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Dijkstra algorithm for finding single source shortest path
 *
 * @author Milan Rathod
 */
public class DijkstraAlgorithm {

    /**
     * Finds the shortest distances from the source vertex to all other vertices
     * in a weighted graph using Dijkstra's algorithm.
     *
     * @param V     the number of vertices in the graph
     * @param edges the array of edges represented as {source, destination, weight}
     * @param src   the source vertex from which distances are calculated
     * @return an array where the value at each index represents the shortest distance
     *         from the source vertex to the vertex at that index
     */
    public int[] find(int V, int[][] edges, int src) {
        WeightedGraph graph = new WeightedGraph(V);

        for (int[] edge : edges) {
            graph.addEdge(graph, edge[0], edge[1], edge[2]);
        }

        int size = graph.getSize();

        int[] distances = new int[size];
        Arrays.fill(distances, Integer.MAX_VALUE);

        PriorityQueue<QueueNode> priorityQueue = new PriorityQueue<>((o1, o2) ->
            o1.distance - o2.distance != 0 ? o1.distance - o2.distance : o1.vertex - o2.vertex);

        QueueNode start = new QueueNode();
        start.vertex = src;
        start.distance = 0;
        distances[src] = 0;

        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()) {
            QueueNode queueNode = priorityQueue.poll();

            int u = queueNode.vertex;

            // Iterate over all adjacent vertices of extracted vertex V
            for (Node neighbor : graph.getAdjList()[u]) {
                final int v = neighbor.dest;
                final int weight = neighbor.weight;

                if (distances[v] > distances[u] + weight) {
                    distances[v] = distances[u] + weight;

                    QueueNode temp = new QueueNode();
                    temp.vertex = v;
                    temp.distance = distances[v];

                    priorityQueue.offer(temp);
                }
            }
        }

        return distances;
    }

    /**
     * Class to represent node in priorityQueue/minHeap
     */
    private static class QueueNode {
        int vertex;

        int distance;
    }
}
