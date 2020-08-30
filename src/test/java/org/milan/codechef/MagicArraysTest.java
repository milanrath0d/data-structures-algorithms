package org.milan.codechef;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test class for {@link MagicArrays}
 *
 * @author Milan Rathod
 */
public class MagicArraysTest {

    @Test
    public void testGetMaxQualityDishes() {
        MagicArrays magicArrays = new MagicArrays();

        List<List<Integer>> input = new ArrayList<>();

        input.add(List.of(1, 2, 3));
        input.add(List.of(3, 2));
        input.add(List.of(4, 5));

        long result = magicArrays.getMaxQualityDishes(input);

        Assert.assertEquals(8, result);
    }
}