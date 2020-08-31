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

    private BinarySearchTree binarySearchTree;

    private ConvertBST2DLL convertBST2DLL;

    @BeforeEach
    void setup() {
        binarySearchTree = new BinarySearchTree(20);

        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(5);
        binarySearchTree.insert(30);
        binarySearchTree.insert(35);
        binarySearchTree.insert(25);

        convertBST2DLL = new ConvertBST2DLL();
    }

    @Test
    void testConvert() {
        BinarySearchTree.Node head = convertBST2DLL.convert(binarySearchTree.getRoot());

        assertEquals(5, head.key);
    }

    @Test
    void testConvertV2() {
        BinarySearchTree.Node head = convertBST2DLL.convertV2(binarySearchTree.getRoot());

        assertEquals(5, head.key);
    }
}