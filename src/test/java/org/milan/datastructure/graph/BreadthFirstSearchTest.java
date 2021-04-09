package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link BreadthFirstSearch}
 *
 * @author Milan Rathod
 */
class BreadthFirstSearchTest {

    @Test
    void testBfs() {
        Graph graph = new Graph(4);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 3);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph);
        breadthFirstSearch.bfs(2);
    }
}