package org.milan.datastructure.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for {@link KthLargestElement}
 *
 * @author Milan Rathod
 */
class KthLargestElementTest {

    private KthLargestElement kthLargestElement;

    private int[] arr;

    @BeforeEach
    void setUp() {
        arr = new int[]{10, 50, 40, 75, 60, 65, 45};

        kthLargestElement = new KthLargestElement();
    }

    @Test
    void testFind() {
        int result = kthLargestElement.find(arr, 3);

        assertEquals(60, result);
    }

    @Test
    void testFindV2() {
        int result = kthLargestElement.findV2(arr, 3);

        assertEquals(65, result);
    }
    
    @Test
    void testFindV3() {
        // Test with a standard array
        int result = kthLargestElement.findV3(arr, 3);
        assertEquals(60, result);
        
        // Test with other arrays
        int[] arr1 = {3, 2, 1, 5, 6, 4};
        assertEquals(5, kthLargestElement.findV3(arr1, 2));
        
        int[] arr2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        assertEquals(4, kthLargestElement.findV3(arr2, 4));
        
        // Test with duplicate elements
        int[] arr3 = {1, 1, 1, 2, 2, 3};
        assertEquals(1, kthLargestElement.findV3(arr3, 6));
        
        // Test with negative numbers
        int[] arr4 = {-1, -2, -3, -4, -5};
        assertEquals(-5, kthLargestElement.findV3(arr4, 5));
    }
    
    @Test
    void testFindV4() {
        // Test with standard array
        int result = kthLargestElement.findV4(arr, 3);
        assertEquals(60, result);
        
        // Test with other arrays
        int[] arr1 = {3, 2, 1, 5, 6, 4};
        assertEquals(5, kthLargestElement.findV4(arr1, 2));
        
        int[] arr2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        assertEquals(4, kthLargestElement.findV4(arr2, 4));
        
        // Test with duplicate elements
        int[] arr3 = {1, 1, 1, 2, 2, 3};
        assertEquals(1, kthLargestElement.findV4(arr3, 6));
        
        // Test with negative numbers
        int[] arr4 = {-1, -2, -3, -4, -5};
        assertEquals(-5, kthLargestElement.findV4(arr4, 5));
    }
    
    @Test
    void testInvalidInput() {
        int[] testArr = {1, 2, 3, 4, 5};
        
        // Test with k greater than array length
        assertThrows(IllegalArgumentException.class, () -> kthLargestElement.findV3(testArr, 6));
        assertThrows(IllegalArgumentException.class, () -> kthLargestElement.findV4(testArr, 6));
        
        // Test with k less than 1
        assertThrows(IllegalArgumentException.class, () -> kthLargestElement.findV3(testArr, 0));
        assertThrows(IllegalArgumentException.class, () -> kthLargestElement.findV4(testArr, 0));
    }
}