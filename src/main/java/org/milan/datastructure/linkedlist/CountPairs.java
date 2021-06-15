package org.milan.datastructure.linkedlist;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Milan Rathod
 */
public class CountPairs {

    /**
     * Time complexity: O(n1*logn1) + O(n2*logn2)
     * Space complexity: O(1)
     *
     * @param list1 first linked list
     * @param list2 second linked list
     * @param sum   sum
     * @return number of pairs
     */
    public int count(java.util.LinkedList<Integer> list1, java.util.LinkedList<Integer> list2, int sum) {

        // Sort first linked list in ascending order
        Collections.sort(list1);

        // Sort second linked list in descending order
        list2.sort(Collections.reverseOrder());

        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        Integer number1 = iterator1.hasNext() ? iterator1.next() : null;
        Integer number2 = iterator2.hasNext() ? iterator2.next() : null;

        int count = 0;

        while (number1 != null && number2 != null) {

            // Move both pointers if sum equals
            if (number1 + number2 == sum) {
                number1 = iterator1.hasNext() ? iterator1.next() : null;
                number2 = iterator2.hasNext() ? iterator2.next() : null;
                count++;
            } else if (number1 + number2 > sum) { // If sum is greater move iterator2
                number2 = iterator2.hasNext() ? iterator2.next() : null;
            } else { // If sum is smaller move iterator1
                number1 = iterator1.hasNext() ? iterator1.next() : null;
            }
        }

        return count;
    }

    /**
     * Time complexity: O(n1 + n2)
     * Space complexity: O(n1)
     *
     * @param list1 first linked list
     * @param list2 second linked list
     * @param sum   sum
     * @return number of pairs
     */
    public int countV2(java.util.LinkedList<Integer> list1, java.util.LinkedList<Integer> list2, int sum) {
        int count = 0;

        // Insert all the elements of first list  in the hashset
        Set<Integer> set = new HashSet<>(list1);

        Iterator<Integer> itr2 = list2.iterator();

        while (itr2.hasNext()) {
            if (!(set.add(sum - itr2.next()))) {
                count++;
            }
        }

        return count;
    }
}
