package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://leetcode.com/problems/beautiful-array/}
 *
 * @author Milan Rathod
 */
public class BeautifulArray {

    public int[] beautifulArray(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        while (res.size() < n) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i : res) if (i * 2 - 1 <= n) tmp.add(i * 2 - 1);
            for (int i : res) if (i * 2 <= n) tmp.add(i * 2);
            res = tmp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
