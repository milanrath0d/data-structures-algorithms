package org.milan.datastructure.string;

/**
 * @author Milan Rathod
 */
public class ReverseStringWithSpecialChars {

    public String reverse(String str) {

        char[] arr = str.toCharArray();

        // Initialize left and right pointers
        int r = arr.length - 1, l = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(arr[l])) {
                l++;
            } else if (!Character.isAlphabetic(arr[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++;
                r--;
            }
        }

        return new String(arr);
    }
}
