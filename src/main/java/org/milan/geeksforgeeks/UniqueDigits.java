package org.milan.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/numbers-unique-distinct-digits/}
 *
 * @author Milan Rathod
 */
public class UniqueDigits {

    public List<Integer> findUnique(int l, int r) {

        List<Integer> outputList = new ArrayList<>();

        // Start traversing the numbers
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean[] visited = new boolean[10];

            // Find digits and maintain its hash
            while (num != 0) {
                // if a digit occurs more than 1 time
                // then break
                if (visited[num % 10])
                    break;

                visited[num % 10] = true;

                num = num / 10;
            }

            // num will be 0 only when above loop
            // doesn't get break that means the
            // number is unique so print it.
            if (num == 0)
                outputList.add(i);
        }
        return outputList;
    }
}
