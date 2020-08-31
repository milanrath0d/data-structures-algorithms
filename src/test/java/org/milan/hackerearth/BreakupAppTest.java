package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BreakupApp}
 *
 * @author Milan Rathod
 */
class BreakupAppTest {

    @Test
    void testGetDate() {
        List<String> list = new ArrayList<>();

        list.add("G: I want to go on 19");
        list.add("M: No that is not possible lets go on 21");
        list.add("G: No 19 is final and 21 is not");
        list.add("M: OKAY as you wish");

        BreakupApp breakupApp = new BreakupApp();

        String result = breakupApp.getDate(list);

        assertEquals("Date", result);
    }

}