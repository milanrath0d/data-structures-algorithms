package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PilesOfBoxes}
 *
 * @author Milan Rathod
 */
class PilesOfBoxesTest {

    @Test
    void minimumSteps() {
        PilesOfBoxes pilesOfBoxes = new PilesOfBoxes();

        assertEquals(3, pilesOfBoxes.minimumSteps(new int[]{5, 2, 1}));

        assertEquals(6, pilesOfBoxes.minimumSteps(new int[]{4, 5, 5, 2, 4}));

        assertEquals(1, pilesOfBoxes.minimumSteps(new int[]{633, 222}));
    }
}