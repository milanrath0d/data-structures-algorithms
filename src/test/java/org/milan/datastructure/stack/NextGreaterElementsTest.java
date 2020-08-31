package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link NextGreaterElements}
 *
 * @author Milan Rathod
 */
class NextGreaterElementsTest {

    @Test
    void testFindAll() {
        int[] input = {4, 5, 2, 25};
        NextGreaterElements nextGreaterElements = new NextGreaterElements();

        String[] result = nextGreaterElements.findAll(input);

        // Order is not maintained in output
        assertArrayEquals(new String[]{"4--5", "2--25", "5--25", "25---1"}, result);
    }

    @Test
    void testFindAllV2() {
        int[] input = {4, 5, 2, 25};
        NextGreaterElements nextGreaterElements = new NextGreaterElements();

        String[] result = nextGreaterElements.findAllV2(input);

        assertArrayEquals(new String[]{"4--5", "5--25", "2--25", "25---1"}, result);
    }
}