package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link StudentWithMaxAvg}
 *
 * @author Milan Rathod
 */
class StudentWithMaxAvgTest {

    @Test
    void testFind() {
        String[][] arr = {{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}};

        StudentWithMaxAvg studentWithMaxAvg = new StudentWithMaxAvg();

        int result = studentWithMaxAvg.find(arr);

        assertEquals(99, result);
    }
}