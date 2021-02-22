package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link ConvertBST2DLL}
 *
 * @author Milan Rathod
 */
class ConvertBST2DLLTest {

    private BinarySearchTree<Integer> binarySearchTree;

    private ConvertBST2DLL convertBST2DLL;

    @BeforeEach
    void setup() {
        binarySearchTree = TreeDataUtil.initializeBST();
        convertBST2DLL = new ConvertBST2DLL();
    }

    @Test
    void testConvert() {
        Node<Integer> head = convertBST2DLL.convert(binarySearchTree.getRoot());

        assertEquals(5, head.key);
    }

    @Test
    void testConvertV2() {
        Node<Integer> head = convertBST2DLL.convertV2(binarySearchTree.getRoot());

        assertEquals(5, head.key);
    }
}