package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link MyCalender}
 *
 * @author Milan Rathod
 */
class MyCalenderTest {

    @Test
    void book() {
        MyCalender myCalender = new MyCalender();

        assertTrue(myCalender.book(10, 20));
        assertFalse(myCalender.book(15, 25));
        assertTrue(myCalender.book(20, 30));
    }

    @Test
    void bookV2() {
        MyCalender myCalender = new MyCalender();

        assertTrue(myCalender.bookV2(10, 20));
        assertFalse(myCalender.bookV2(15, 25));
        assertTrue(myCalender.bookV2(20, 30));
    }
}