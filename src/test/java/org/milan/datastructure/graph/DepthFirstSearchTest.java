package org.milan.datastructure.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for {@link DepthFirstSearch}
 *
 * @author Milan Rathod
 */
class DepthFirstSearchTest {

    private DepthFirstSearch depthFirstSearch;

    @BeforeEach
    void setup() {
        Graph graph = new Graph(4);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 3);

        depthFirstSearch = new DepthFirstSearch(graph);
    }

    @Test
    void testDfs() {
        depthFirstSearch.dfs(2);
    }

    @Test
    void testDfsIterative() {
        depthFirstSearch.dfsIterative(2);
    }
}