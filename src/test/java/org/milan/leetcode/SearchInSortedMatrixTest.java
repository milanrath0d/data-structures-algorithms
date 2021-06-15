package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SearchInSortedMatrix}
 *
 * @author Milan Rathod
 */
class SearchInSortedMatrixTest {

    @Test
    void isPresent() {
        int[][] matrix = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};

        SearchInSortedMatrix searchInSortedMatrix = new SearchInSortedMatrix();

        assertTrue(searchInSortedMatrix.isPresent(matrix, 38));

        assertFalse(searchInSortedMatrix.isPresent(matrix, 30));
    }
}