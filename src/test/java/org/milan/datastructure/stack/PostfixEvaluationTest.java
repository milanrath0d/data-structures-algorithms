package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PostfixEvaluation}
 *
 * @author Milan Rathod
 */
class PostfixEvaluationTest {

    @Test
    void testEvaluate() {
        PostfixEvaluation postfixEvaluation = new PostfixEvaluation();

        assertEquals(288, postfixEvaluation.evaluate("6523+8*+3+*"));

        assertEquals(4, postfixEvaluation.evaluate("231*+9-"));
    }
}