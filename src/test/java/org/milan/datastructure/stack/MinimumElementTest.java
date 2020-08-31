package org.milan.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumElement}
 *
 * @author Milan Rathod
 */
class MinimumElementTest {

    private MinimumElement minimumElement;

    @BeforeEach
    void setup() {
        minimumElement = new MinimumElement();
    }

    @Test
    void testGetMinimum() {
        minimumElement.push(2);
        minimumElement.push(6);
        minimumElement.push(4);
        minimumElement.push(1);
        minimumElement.push(5);

        assertEquals(1, minimumElement.getMinimum());

        minimumElement.pop();

        assertEquals(1, minimumElement.getMinimum());

        minimumElement.pop();

        assertEquals(2, minimumElement.getMinimum());
    }

    @Test
    void testGetMinimumV2() {
        minimumElement.pushV2(2);
        minimumElement.pushV2(6);
        minimumElement.pushV2(4);
        minimumElement.pushV2(1);
        minimumElement.pushV2(5);

        assertEquals(1, minimumElement.getMinimumV2());

        minimumElement.popV2();

        assertEquals(1, minimumElement.getMinimumV2());

        minimumElement.popV2();

        assertEquals(2, minimumElement.getMinimumV2());
    }
}