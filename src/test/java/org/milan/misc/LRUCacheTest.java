package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LRUCache}
 *
 * @author Milan Rathod
 */
class LRUCacheTest {

    @Test
    void testRefer() {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(15);
        lruCache.refer(10);
        lruCache.refer(12);
        lruCache.refer(15);
        lruCache.refer(10);
        lruCache.refer(16);

        assertEquals(2, lruCache.getPageHit());

        assertEquals(5, lruCache.getPageFault());
    }
}