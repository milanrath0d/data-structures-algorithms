package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link RedundantConnection}
 *
 * @author Milan Rathod
 */
class RedundantConnectionTest {

    @Test
    void findRedundantConnection() {
        RedundantConnection redundantConnection = new RedundantConnection();

        assertArrayEquals(new int[]{2, 3}, redundantConnection.findRedundantConnection(
            new int[][]{{1, 2}, {1, 3}, {2, 3}}));

        assertArrayEquals(new int[]{1, 4}, redundantConnection.findRedundantConnection(
            new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));

    }
}