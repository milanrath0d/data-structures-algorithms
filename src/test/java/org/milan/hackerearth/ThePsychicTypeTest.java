package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link ThePsychicType}
 *
 * @author Milan Rathod
 */
class ThePsychicTypeTest {

    @Test
    void testIsReachable() {
        ThePsychicType thePsychicType = new ThePsychicType();
        boolean result = thePsychicType.isReachable(new int[]{3, 4, 2, 5, 5}, 1, 4);

        assertTrue(result);
    }
}