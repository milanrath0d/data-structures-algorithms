package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutsAndBoltsProblemTest {

    @Test
    void testMatchPairs() {
        char[] nuts = {'@', '#', '$', '%', '^', '&'};
        char[] bolts = {'$', '%', '&', '^', '@', '#'};

        NutsAndBoltsProblem nutsAndBoltsProblem = new NutsAndBoltsProblem();

        nutsAndBoltsProblem.matchPairs(nuts, bolts);

        assertArrayEquals(new char[]{'#', '$', '%', '&', '@', '^'}, nuts);
        assertArrayEquals(new char[]{'#', '$', '%', '&', '@', '^'}, bolts);
    }

}