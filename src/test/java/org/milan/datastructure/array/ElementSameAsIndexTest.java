package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ElementSameAsIndex}
 *
 * @author Milan Rathod
 */
class ElementSameAsIndexTest {

    @Test
    void findIndex() {
        ElementSameAsIndex elementSameAsIndex = new ElementSameAsIndex();

        int result = elementSameAsIndex.findIndex(new int[]{-4, -2, 1, 2, 3, 5, 9});

        assertEquals(5, result);
    }
}