package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DeleteDuplicates}
 *
 * @author Milan Rathod
 */
class DeleteDuplicatesTest {

    @Test
    void testReturnUniqueNumbers() {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        Integer[] original = {11, 2, 4, 2, 3};
        Integer[] finalValue = new Integer[original.length + 1];

        // method to return unique values
        Integer[] unique = deleteDuplicates.returnUniqueNumbers(original, finalValue);

        assertEquals(4, Arrays.stream(unique).filter(Objects::nonNull).count());
    }
}