package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TopologicalSort}
 *
 * @author Milan Rathod
 */
class TopologicalSortTest {

    @Test
    void testSort() {
        Graph graph = new Graph(6);
        graph.addEdge(graph, 5, 2);
        graph.addEdge(graph, 5, 0);
        graph.addEdge(graph, 4, 0);
        graph.addEdge(graph, 4, 1);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 1);

        TopologicalSort topologicalSort = new TopologicalSort(graph);

        List<Integer> sortedList = topologicalSort.sort();

        assertEquals(Arrays.asList(5, 4, 2, 3, 1, 0), sortedList);
    }
}