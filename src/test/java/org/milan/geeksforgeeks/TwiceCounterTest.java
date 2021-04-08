package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TwiceCounter}
 *
 * @author Milan Rathod
 */
class TwiceCounterTest {

    @Test
    void testCountWords() {
        TwiceCounter twiceCounter = new TwiceCounter();

        String[] str = {"hate", "love", "peace", "love",
                "peace", "hate", "love", "peace",
                "love", "peace"};

        int result = twiceCounter.countWords(str, str.length);

        assertEquals(1, result);
    }
}