package org.milan.datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link NextGreaterElements}
 *
 * @author Milan Rathod
 */
public class NextGreaterElementsTest {

    @Test
    public void testFindAll() {
        int[] input = {4, 5, 2, 25};
        NextGreaterElements nextGreaterElements = new NextGreaterElements();

        String[] result = nextGreaterElements.findAll(input);

        // Order is not maintained in output
        Assert.assertArrayEquals(new String[]{"4--5", "2--25", "5--25", "25---1"}, result);
    }

    @Test
    public void testFindAllV2() {
        int[] input = {4, 5, 2, 25};
        NextGreaterElements nextGreaterElements = new NextGreaterElements();

        String[] result = nextGreaterElements.findAllV2(input);

        Assert.assertArrayEquals(new String[]{"4--5", "5--25", "2--25", "25---1"}, result);
    }
}