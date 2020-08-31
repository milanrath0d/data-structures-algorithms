package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Test class for {@link ShuffleElements}
 *
 * @author Milan Rathod
 */
class ShuffleElementsTest {

    @Test
    void testShuffle() {
        ShuffleElements shuffleElements = new ShuffleElements();

        int[] shuffledElements = shuffleElements.shuffle(new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        System.out.println(Arrays.toString(shuffledElements));
    }

}