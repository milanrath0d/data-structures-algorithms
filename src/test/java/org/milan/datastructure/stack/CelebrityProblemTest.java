package org.milan.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CelebrityProblem}
 *
 * @author Milan Rathod
 */
class CelebrityProblemTest {

    private CelebrityProblem celebrityProblem;

    @BeforeEach
    void setUp() throws Exception {

        int[][] matrix = {{0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}};

        celebrityProblem = new CelebrityProblem(matrix);
    }

    @Test
    void testFindCelebrity() {
        int result = celebrityProblem.findCelebrity(4);

        assertEquals(2, result);
    }

    @Test
    void testFindCelebrityV2() {
        int result = celebrityProblem.findCelebrityV2(4);

        assertEquals(2, result);
    }
}