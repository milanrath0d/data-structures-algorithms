package org.milan.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Refer {@link @https://leetcode.com/problems/design-movie-rental-system/}
 *
 * @author Milan Rathod
 */
public class MovieRentalSystem {

    /**
     * Map of shop and movie string as key and entry as value
     */
    private final Map<String, Entry> entryMap;

    /**
     * Map of shop as key and tree set of entries as values which stores available movies for rental
     */
    private final Map<Integer, TreeSet<Entry>> availableMap;

    /**
     * Maximum number of results to be returned
     */
    private static final int MAX_LIMIT = 5;

    /**
     * Custom comparator sorts based on price, shop and movie
     */
    private final Comparator<Entry> order = (e1, e2) -> e1.price == e2.price ?
        (e1.shop == e2.shop ? Integer.compare(e1.movie, e2.movie) : Integer.compare(e1.shop, e2.shop))
        : Integer.compare(e1.price, e2.price);

    /**
     * Set of rental movie details
     */
    private final Set<Entry> rented;

    private final int n;

    public MovieRentalSystem(int n, int[][] entries) {
        this.n = n;

        entryMap = new HashMap<>();

        availableMap = new HashMap<>();

        rented = new TreeSet<>(order);

        for (int[] entry : entries) {
            int shop = entry[0];
            int movie = entry[1];
            int price = entry[2];
            Entry newEntry = new Entry(shop, movie, price);
            entryMap.put(getKey(shop, movie), newEntry);
            availableMap.computeIfAbsent(entry[1], integer -> new TreeSet<>(order)).add(newEntry);
        }
    }

    /**
     * @param shop  shop
     * @param movie movie
     * @return string concatenation of shop and movie
     */
    private String getKey(int shop, int movie) {
        return shop + ":" + movie;
    }

    /**
     * @param movie movie
     * @return list of shops that have an unrented copy of the given movie
     */
    public List<Integer> search(int movie) {
        return availableMap.getOrDefault(movie, new TreeSet<>(order))
            .stream()
            .limit(MAX_LIMIT)
            .map(entry -> entry.shop)
            .collect(Collectors.toList());
    }

    /**
     * Rents the given movie from the given shop
     *
     * @param shop  shop
     * @param movie movie
     */
    public void rent(int shop, int movie) {
        Entry entry = entryMap.get(getKey(shop, movie));
        if (entry != null) {
            availableMap.get(movie).remove(entry);
            rented.add(entry);
        }
    }

    /**
     * Drops off a previously rented movie at the given shop
     *
     * @param shop  shop
     * @param movie movie
     */
    public void drop(int shop, int movie) {
        Entry entry = entryMap.get(getKey(shop, movie));
        if (entry != null) {
            rented.remove(entry);
            availableMap.get(movie).add(entry);
        }
    }

    /**
     * @return list of cheapest rented movies with shops
     */
    public List<List<Integer>> report() {
        return rented.stream()
            .limit(MAX_LIMIT)
            .map(entry -> Arrays.asList(entry.shop, entry.movie))
            .collect(Collectors.toList());
    }

    static class Entry {
        int shop;

        int movie;

        int price;

        public Entry(int shop, int movie, int price) {
            this.shop = shop;
            this.movie = movie;
            this.price = price;
        }
    }
}
