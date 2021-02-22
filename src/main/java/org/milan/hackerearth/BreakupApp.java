package org.milan.hackerearth;

import java.util.List;
import java.util.Scanner;

/**
 * Breakup App - Linear Search
 *
 * @author Milan Rathod
 */
public class BreakupApp {

    private int date = 0;

    private int noDate = 0;

    public String getDate(List<String> list) {
        list.forEach(str -> {
            Scanner sn = new Scanner(str).useDelimiter("[^\\d]+");
            computeDateCount(sn, str.startsWith("G") ? 2 : 1);
        });
        return date > noDate ? "Date" : "No Date";
    }

    private void computeDateCount(Scanner sn, int counter) {
        while (sn.hasNext()) {
            String num = sn.next();
            if (num.equals(String.valueOf(19)) || num.equals(String.valueOf(20))) {
                date += counter;
            } else {
                noDate += counter;
            }
        }
    }
}
