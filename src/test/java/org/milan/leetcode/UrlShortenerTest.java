package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link UrlShortener}
 *
 * @author Milan Rathod
 */
class UrlShortenerTest {

    @Test
    void testOperations() {
        UrlShortener urlShortener = new UrlShortener();

        String url = "https://leetcode.com/problems/design-tinyurl";

        String tinyUrl = urlShortener.encode(url);

        assertEquals(url, urlShortener.decode(tinyUrl));
    }

}