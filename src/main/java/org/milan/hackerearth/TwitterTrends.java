package org.milan.hackerearth;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem: {@link @https://www.hackerearth.com/practice/algorithms/string-algorithm/string-searching/practice-problems/algorithm/twitter-trends/}
 *
 * @author Milan Rathod
 */
public class TwitterTrends {

    private Map<String, Integer> treeMap = new TreeMap<>();

    public List<String> trendingHashTags(List<String> tweets) {

        List<String> outputList = new ArrayList<>();

        tweets.forEach(this::extractHashTags);

        treeMap = sortByValues(treeMap);
        int count = 0;
        Iterator<Entry<String, Integer>> it = treeMap.entrySet().iterator();
        while (count < 5) {
            outputList.add(it.next().getKey());
            count++;
        }
        return outputList;
    }

    private void extractHashTags(String tweet) {
        Pattern pattern = Pattern.compile("#\\w+");

        Matcher matcher = pattern.matcher(tweet);
        while (matcher.find()) {
            String str = matcher.group();
            if (treeMap.containsKey(str)) {
                int count = treeMap.get(str);
                treeMap.put(str, count + 1);
            } else {
                treeMap.put(str, 1);
            }

        }
    }

    private static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator = (k1, k2) -> {
            int compare = map.get(k2).compareTo(map.get(k1));
            if (compare == 0)
                return 1;
            else
                return compare;
        };

        Map<K, V> sortedByValues = new TreeMap<>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    private void sortLogicForTreeMapBasedOnValues() {
        List<String> list = new ArrayList<>();
        while (!treeMap.isEmpty()) {

            int max = Integer.MIN_VALUE;
            String ht = "";
            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {

                if (entry.getValue() > max) {
                    max = entry.getValue();
                    ht = entry.getKey();
                }
            }

            treeMap.remove(ht, max);
            list.add(ht);
        }
    }

}
