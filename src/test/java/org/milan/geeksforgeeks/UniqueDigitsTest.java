package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UniqueDigitsTest {

    @Test
    void testFindUnique() {
        UniqueDigits uniqueDigits = new UniqueDigits();

        List<Integer> result = uniqueDigits.findUnique(10, 20);

        assertArrayEquals(new int[]{10, 12, 13, 14, 15, 16, 17, 18, 19, 20}, result.stream().mapToInt(value -> value).toArray());
    }
}