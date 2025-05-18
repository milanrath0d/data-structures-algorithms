package org.milan.algorithm.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SubSets}
 *
 * @author Milan Rathod
 */
class SubSetsTest {

    private SubSets subSets;

    @BeforeEach
    void setup() {
        subSets = new SubSets();
    }

    @Test
    void testSubsets_EmptyArray() {
        int[] nums = {};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For empty array, only empty subset should be returned
        assertEquals(1, result.size());
        assertTrue(result.getFirst().isEmpty());
    }

    @Test
    void testSubsets_SingleElement() {
        int[] nums = {1};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For array with one element, two subsets should be returned: [] and [1]
        assertEquals(2, result.size());
        
        // Convert to set of lists for easier comparison
        Set<List<Integer>> resultSet = new HashSet<>(result);
        assertTrue(resultSet.contains(Collections.emptyList()));
        assertTrue(resultSet.contains(Collections.singletonList(1)));
    }

    @Test
    void testSubsets_MultipleElements() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For array with 3 elements, 2^3 = 8 subsets should be returned
        assertEquals(8, result.size());
        
        // Convert result to set of lists for easier comparison
        Set<List<Integer>> resultSet = new HashSet<>(result);
        
        // Verify all expected subsets are present
        assertTrue(resultSet.contains(Collections.emptyList()));
        assertTrue(resultSet.contains(Collections.singletonList(1)));
        assertTrue(resultSet.contains(Collections.singletonList(2)));
        assertTrue(resultSet.contains(Collections.singletonList(3)));
        assertTrue(resultSet.contains(Arrays.asList(1, 2)));
        assertTrue(resultSet.contains(Arrays.asList(1, 3)));
        assertTrue(resultSet.contains(Arrays.asList(2, 3)));
        assertTrue(resultSet.contains(Arrays.asList(1, 2, 3)));
    }

    @Test
    void testSubsets_LargerArray() {
        int[] nums = {5, 10, 15, 20};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For array with 4 elements, 2^4 = 16 subsets should be returned
        assertEquals(16, result.size());
        
        // Verify empty subset and full set are present
        assertTrue(result.contains(Collections.emptyList()));
        
        List<Integer> fullSet = Arrays.asList(5, 10, 15, 20);
        boolean containsFullSet = false;
        
        for (List<Integer> subset : result) {
            if (subset.size() == fullSet.size() && subset.containsAll(fullSet)) {
                containsFullSet = true;
                break;
            }
        }
        
        assertTrue(containsFullSet, "Result should contain the full set");
    }
    
    @Test
    void testSubsets_ElementOrder() {
        int[] nums = {3, 2, 1};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For array with 3 elements, 2^3 = 8 subsets should be returned
        assertEquals(8, result.size());
        
        // Check if the elements in subset maintain order of appearance in original array
        boolean hasCorrectSubset = false;
        
        for (List<Integer> subset : result) {
            if (subset.size() == 3) {
                // The full subset should have elements in the order they appear in nums
                if (subset.get(0) == 3 && subset.get(1) == 2 && subset.get(2) == 1) {
                    hasCorrectSubset = true;
                    break;
                }
            }
        }
        
        assertTrue(hasCorrectSubset, "Full subset should maintain original element order");
    }
    
    @Test
    void testSubsets_WithNegativeNumbers() {
        int[] nums = {-1, -2, 3};
        List<List<Integer>> result = subSets.subsets(nums);
        
        // For array with 3 elements, 2^3 = 8 subsets should be returned
        assertEquals(8, result.size());
        
        // Verify subsets with negative numbers are correctly formed
        Set<List<Integer>> resultSet = new HashSet<>(result);
        assertTrue(resultSet.contains(Collections.emptyList()));
        assertTrue(resultSet.contains(Collections.singletonList(-1)));
        assertTrue(resultSet.contains(Collections.singletonList(-2)));
        assertTrue(resultSet.contains(Collections.singletonList(3)));
        assertTrue(resultSet.contains(Arrays.asList(-1, -2)));
        assertTrue(resultSet.contains(Arrays.asList(-1, 3)));
        assertTrue(resultSet.contains(Arrays.asList(-2, 3)));
        assertTrue(resultSet.contains(Arrays.asList(-1, -2, 3)));
    }
}
