package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link KMostRecentlyUsedApps}
 *
 * @author Milan Rathod
 */
class KMostRecentlyUsedAppsTest {

    @Test
    void find() {
        KMostRecentlyUsedApps kMostRecentlyUsedApps = new KMostRecentlyUsedApps();

        assertArrayEquals(new int[]{4, 3, 5, 2, 1}, kMostRecentlyUsedApps.find(new int[]{3, 5, 2, 4, 1}, 3));

        assertArrayEquals(new int[]{3, 5, 7, 2, 4, 1, 6}, kMostRecentlyUsedApps.find(new int[]{5, 7, 2, 3, 4, 1, 6}, 10));
    }
}