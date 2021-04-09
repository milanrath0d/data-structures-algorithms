package org.milan.datastructure.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TextJustification}
 *
 * @author Milan Rathod
 */
class TextJustificationTest {

    @Test
    void testJustify() {
        TextJustification textJustification = new TextJustification();

        String[] words = {"This", "is", "a", "text", "justification", "problem", "in", "tutorial", "horizon"};

        String result = textJustification.justify(words, 25, 0);

        assertEquals(3, result.split("\n").length);
    }

}