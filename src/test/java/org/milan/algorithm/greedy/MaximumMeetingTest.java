package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumMeeting}
 *
 * @author Milan Rathod
 */
class MaximumMeetingTest {

    @Test
    void testMaxMeeting() {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};

        MaximumMeeting maximumMeeting = new MaximumMeeting();

        int result = maximumMeeting.maxMeeting(s, f, s.length);

        assertEquals(4, result);

        s = new int[]{75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        f = new int[]{112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};

        result = maximumMeeting.maxMeeting(s, f, s.length);

        assertEquals(3, result);
    }

}