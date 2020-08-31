package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link JobSequencing}
 *
 * @author Milan Rathod
 */
class JobSequencingTest {

    @Test
    void testFind() {
        JobSequencing jobSequencing = new JobSequencing();

        Job[] jobs = {new Job('a', 2, 100),
                new Job('b', 1, 19),
                new Job('c', 2, 27),
                new Job('d', 1, 25),
                new Job('e', 3, 15)};

        String result = jobSequencing.find(jobs);

        assertEquals("cae", result);
    }
}