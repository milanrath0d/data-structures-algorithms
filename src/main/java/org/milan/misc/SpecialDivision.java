package org.milan.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO complete this
 *
 * @author Milan Rathod
 */
public class SpecialDivision {

    public String find(int dividend, int divisor) {
        int quotient = dividend / divisor;

        int remainder = dividend % divisor;

        String output = "";

        output += quotient;

        Map<Integer, Integer> map = new HashMap<>();

        int count = 10;

        String decimalPoint = "";

        while (remainder > 0 && count-- > 0) {
            quotient = (remainder * 10) / divisor;
            remainder = (remainder * 10) % divisor;

            decimalPoint += quotient;

            if (!map.containsKey(remainder)) {
                map.put(remainder, decimalPoint.length() - 1);
            } else {
                Integer index = map.get(remainder);
                String repetitive = "(" + decimalPoint.substring(index + 1) + ")";

                if (index >= 0) {
                    decimalPoint = decimalPoint.substring(0, index + 1) + repetitive;
                } else {
                    decimalPoint = repetitive;
                }
                break;
            }
        }

        if (remainder > 0) {
            output += "." + decimalPoint;
        }

        return output;
    }
}

