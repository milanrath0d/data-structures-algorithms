package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SearchInRowWiseColumnWiseSortedMatrix}
 *
 * @author Milan Rathod
 */
class SearchInRowWiseColumnWiseSortedMatrixTest {

    @Test
    void search() {
        int[][] matrix = {{10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};

        SearchInRowWiseColumnWiseSortedMatrix searchInRowWiseColumnWiseSortedMatrix =
            new SearchInRowWiseColumnWiseSortedMatrix();

        assertTrue(searchInRowWiseColumnWiseSortedMatrix.search(matrix, 29));

        assertFalse(searchInRowWiseColumnWiseSortedMatrix.search(matrix, 38));
    }

    @Test
    void searchV2() {
        int[][] matrix = {{10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};

        SearchInRowWiseColumnWiseSortedMatrix searchInRowWiseColumnWiseSortedMatrix =
            new SearchInRowWiseColumnWiseSortedMatrix();

        assertTrue(searchInRowWiseColumnWiseSortedMatrix.searchV2(matrix, 29));

        assertFalse(searchInRowWiseColumnWiseSortedMatrix.searchV2(matrix, 38));
    }
}