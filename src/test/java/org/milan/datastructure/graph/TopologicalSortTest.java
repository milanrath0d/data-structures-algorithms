package org.milan.datastructure.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link TopologicalSort}
 *
 * @author Milan Rathod
 */
class TopologicalSortTest {

    private TopologicalSort topologicalSort;

    @BeforeEach
    void setUp() {
        topologicalSort = new TopologicalSort();
    }

    @Test
    void testGeeksForGeeksExample() {
        // Example from GeeksForGeeks: https://www.geeksforgeeks.org/topological-sorting/
        // Graph:
        //  5 -> 0 <- 4
        //  |         |
        //  v         v
        //  2 -> 3 -> 1

        int[][] edges = new int[][]{{5, 0}, {4, 0}, {5, 2}, {2, 3}, {3, 1}, {4, 1}};

        List<Integer> sortedList = topologicalSort.sort(6, edges);

        // Since there can be multiple valid topological sorts, 
        // we check that it satisfies the dependency constraints
        assertTrue(isValidTopologicalSort(edges, sortedList),
                "Resulting order should satisfy all dependencies");
        
        // Common valid outputs include [5, 4, 2, 3, 1, 0] or [4, 5, 2, 3, 1, 0]
        assertEquals(6, sortedList.size(), "All vertices should be included");
    }
    
    @Test
    void testLargerGraph() {
        // A larger graph with more complex dependencies
        int[][] edges = new int[][]{
            {0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 5}, {4, 5}, {4, 6}, {5, 7}, {6, 7}
        };
        
        List<Integer> sortedList = topologicalSort.sort(8, edges);
        
        assertTrue(isValidTopologicalSort(edges, sortedList),
                "Resulting order should satisfy all dependencies");
        assertEquals(8, sortedList.size(), "All vertices should be included");
    }
    
    @Test
    void testDisconnectedGraph() {
        // A graph with disconnected components
        int[][] edges = new int[][]{
            {0, 1}, {2, 3}, {4, 5}, {6, 7}
        };
        
        List<Integer> sortedList = topologicalSort.sort(8, edges);
        
        assertTrue(isValidTopologicalSort(edges, sortedList),
                "Resulting order should satisfy all dependencies");
        assertEquals(8, sortedList.size(), "All vertices should be included");
    }
    
    @Test
    void testLinearGraph() {
        // A simple linear chain
        int[][] edges = new int[][]{
            {0, 1}, {1, 2}, {2, 3}, {3, 4}
        };
        
        List<Integer> sortedList = topologicalSort.sort(5, edges);
        
        assertEquals(Arrays.asList(0, 1, 2, 3, 4), sortedList, 
                "Linear chain should have only one valid topological sort");
    }
    
    @Test
    void testEmptyGraph() {
        // Graph with no edges
        int[][] edges = new int[][]{};
        
        List<Integer> sortedList = topologicalSort.sort(3, edges);
        
        assertEquals(3, sortedList.size(), "All vertices should be included");
    }
    
    /**
     * Helper method to verify if a topological sort is valid
     * A valid topological sort must satisfy that for each directed edge u -> v,
     * u comes before v in the ordering.
     */
    private boolean isValidTopologicalSort(int[][] edges, List<Integer> sortedList) {
        // Create a map of indices for quick lookup
        int[] indices = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            indices[sortedList.get(i)] = i;
        }
        
        // Check that for each edge, the source comes before destination
        for (int[] edge : edges) {
            int src = edge[0];
            int dest = edge[1];
            if (indices[src] >= indices[dest]) {
                return false;
            }
        }
        
        return true;
    }
}