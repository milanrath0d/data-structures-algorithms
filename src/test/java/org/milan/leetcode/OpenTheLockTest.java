package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link OpenTheLock}
 *
 * @author Milan Rathod
 */
class OpenTheLockTest {

    @Test
    void openLock() {
        OpenTheLock openTheLock = new OpenTheLock();

        int result = openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");

        assertEquals(6, result);

        result = openTheLock.openLock(new String[]{"8888"}, "0009");

        assertEquals(1, result);

        result = openTheLock.openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888");

        assertEquals(-1, result);

        result = openTheLock.openLock(new String[]{"0000"}, "8888");

        assertEquals(-1, result);
    }
}