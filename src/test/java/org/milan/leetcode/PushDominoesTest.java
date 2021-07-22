package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link PushDominoes}
 *
 * @author Milan Rathod
 */
class PushDominoesTest {

    @Test
    void pushDominoes() {
        PushDominoes pushDominoes = new PushDominoes();

        assertEquals("RR.L", pushDominoes.pushDominoes("RR.L"));

        assertEquals("LL.RR.LLRRLL..", pushDominoes.pushDominoes(".L.R...LR..L.."));
    }
}