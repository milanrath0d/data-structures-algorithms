package org.milan.datastructure.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link PostOrderFromInOrderAndPreOrder}
 *
 * @author Milan Rathod
 */
class PostOrderFromInOrderAndPreOrderTest {

    @Test
    void get() {
        PostOrderFromInOrderAndPreOrder postOrderFromInOrderAndPreOrder = new PostOrderFromInOrderAndPreOrder();

        int[] in = {4, 2, 5, 1, 3, 6};
        int[] pre = {1, 2, 4, 5, 3, 6};

        List<Integer> postOrderList = postOrderFromInOrderAndPreOrder.get(pre, in);

        assertArrayEquals(new int[]{4, 5, 2, 6, 3, 1}, TreeDataUtil.toArray(postOrderList));
    }
}