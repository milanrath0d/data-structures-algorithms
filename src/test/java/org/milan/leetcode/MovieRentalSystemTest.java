package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link MovieRentalSystem}
 *
 * @author Milan Rathod
 */
class MovieRentalSystemTest {

    @Test
    void testOperations() {
        MovieRentalSystem movieRentalSystem = new MovieRentalSystem(3, new int[][]{{0, 1, 5}, {0, 2, 6}, {0, 3, 7},
                {1, 1, 4}, {1, 2, 7}, {2, 1, 5}});

        assertTrue(ListUtil.isEqual(Arrays.asList(1, 0, 2), movieRentalSystem.search(1)));

        movieRentalSystem.rent(0, 1);
        movieRentalSystem.rent(1, 2);

        List<List<Integer>> report = movieRentalSystem.report();

        assertEquals(2, report.size());
        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1), report.get(0)));
        assertTrue(ListUtil.isEqual(Arrays.asList(1, 2), report.get(1)));

        movieRentalSystem.drop(1, 2);

        assertTrue(ListUtil.isEqual(Arrays.asList(0, 1), movieRentalSystem.search(2)));
    }

}