package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DijkstraAlgorithm}
 *
 * @author Milan Rathod
 */
class DijkstraAlgorithmTest {

    @Test
    void testSimpleGraph() {
        int[][] edges = new int[][]{
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 15},
            {1, 3, 15},
            {2, 3, 4}
        };

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();

        int[] distances = dijkstraAlgorithm.find(4, edges, 0);

        // Expected shortest distances from source vertex 0
        int[] expected = {0, 10, 6, 10};
        assertArrayEquals(expected, distances, "Shortest paths from vertex 0 are incorrect");
    }

    @Test
    void testComplexGraph() {
        int[][] edges = new int[][]{
            {0, 1, 4},
            {0, 7, 8},
            {1, 2, 8},
            {1, 7, 11},
            {2, 3, 7},
            {2, 8, 2},
            {2, 5, 4},
            {3, 4, 9},
            {3, 5, 14},
            {4, 5, 10},
            {5, 6, 2},
            {6, 7, 1},
            {6, 8, 6},
            {7, 8, 7}
        };

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(9, edges, 0);

        // Expected shortest distances from source vertex 0 based on GeeksForGeeks example
        int[] expected = {0, 4, 12, 19, 21, 11, 9, 8, 14};
        assertArrayEquals(expected, distances, "Shortest paths from vertex 0 in complex graph are incorrect");
    }

    @Test
    void testDisconnectedGraph() {
        int[][] edges = new int[][]{
            {0, 1, 3},
            {1, 2, 5},
            {3, 4, 2},
        };

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(5, edges, 0);

        // Expected shortest distances from vertex 0
        // Vertices 3 and 4 are unreachable, so their distance should be Integer.MAX_VALUE
        int[] expected = {0, 3, 8, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, distances, "Shortest paths in disconnected graph are incorrect");
    }


    @Test
    void testDifferentSourceVertex() {
        int[][] edges = new int[][]{
            {0, 1, 10},
            {0, 2, 5},
            {1, 3, 1},
            {2, 1, 3},
            {2, 3, 8},
            {2, 4, 2},
            {3, 4, 4}
        };

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(5, edges, 2);

        // Expected shortest distances from vertex 2
        int[] expected = {5, 3, 0, 4, 2};
        assertArrayEquals(expected, distances, "Shortest paths from vertex 2 are incorrect");
    }

    @Test
    void testSingleVertexGraph() {
        int[][] edges = new int[][]{};

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(1, edges, 0);

        // Expected distance for a single vertex (to itself) is 0
        int[] expected = {0};
        assertArrayEquals(expected, distances, "Distance to self in single vertex graph should be 0");
    }

    @Test
    void testLargeGraph() {
        // Create a larger graph to test algorithm efficiency
        int V = 100;
        // Create a connected graph where each vertex is connected to its neighbors with random weights
        int[][] edges = new int[V * 3][3]; // Each vertex connects to ~3 neighbors

        int edgeIndex = 0;
        for (int i = 0; i < V; i++) {
            // Connect to next vertex
            if (i < V - 1) {
                edges[edgeIndex][0] = i;
                edges[edgeIndex][1] = i + 1;
                edges[edgeIndex][2] = (i % 10) + 1; // Weight between 1-10
                edgeIndex++;
            }

            // Connect to vertex i+5 if possible
            if (i + 5 < V) {
                edges[edgeIndex][0] = i;
                edges[edgeIndex][1] = i + 5;
                edges[edgeIndex][2] = (i % 15) + 5; // Weight between 5-19
                edgeIndex++;
            }

            // Connect to vertex i+10 if possible
            if (i + 10 < V) {
                edges[edgeIndex][0] = i;
                edges[edgeIndex][1] = i + 10;
                edges[edgeIndex][2] = (i % 20) + 10; // Weight between 10-29
                edgeIndex++;
            }
        }

        // Trim the array to the actual number of edges created
        int[][] trimmedEdges = new int[edgeIndex][3];
        System.arraycopy(edges, 0, trimmedEdges, 0, edgeIndex);

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(V, trimmedEdges, 0);

        // Verify a few key properties:
        // 1. Source vertex has distance 0
        // 2. All distances are non-negative
        // 3. Distance to vertex 1 should be the direct edge weight
        assertEquals(0, distances[0], "Distance to source should be 0");
        assertEquals(edges[0][2], distances[1], "Distance to vertex 1 should match direct edge weight");

        // Check that all distances are non-negative (or MAX_VALUE for unreachable vertices)
        for (int distance : distances) {
            assertTrue(distance >= 0 || distance == Integer.MAX_VALUE,
                "All distances should be non-negative or MAX_VALUE");
        }
    }

    private void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    @Test
    void testCycleGraph() {
        // Create a graph with a cycle to ensure Dijkstra handles it correctly
        int[][] edges = new int[][]{
            {0, 1, 1},
            {1, 2, 2},
            {2, 3, 3},
            {3, 0, 4} // Creates a cycle
        };

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[] distances = dijkstraAlgorithm.find(4, edges, 0);

        // Expected distances taking the shortest path in an undirected graph
        int[] expected = {0, 1, 3, 4};
        assertArrayEquals(expected, distances, "Shortest paths in graph with cycle are incorrect");
    }
}