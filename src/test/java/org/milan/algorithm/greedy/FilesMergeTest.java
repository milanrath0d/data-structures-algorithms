package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FilesMerge}
 *
 * @author Milan Rathod
 */
class FilesMergeTest {

    @Test
    void testMerge() {
        FilesMerge filesMerge = new FilesMerge();

        int result = filesMerge.merge(new int[]{2, 3, 4, 5, 6, 7});

        assertEquals(68, result);
    }
}