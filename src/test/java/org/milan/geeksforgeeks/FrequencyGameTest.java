package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyGameTest {

    @Test
    void testFindLargeButMinimumFrequencyElement() {
        int[] arr = {2, 2, 5, 50, 1};

        FrequencyGame frequencyGame = new FrequencyGame();

        int result = frequencyGame.findLargeButMinimumFrequencyElement(arr);

        assertEquals(50, result);

        arr = new int[]{2, 2, 40, 50, 50};

        result = frequencyGame.findLargeButMinimumFrequencyElement(arr);

        assertEquals(40, result);
    }
}