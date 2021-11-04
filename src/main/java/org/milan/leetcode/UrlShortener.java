package org.milan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Refer {@link @https://leetcode.com/problems/encode-and-decode-tinyurl/}
 *
 * @author Milan Rathod
 */
public class UrlShortener {

    /**
     * All possible 62 characters
     */
    private static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * Map with key as tiny url and value as long url
     */
    private static final Map<String, String> tinyUrlToLongUrlMapping = new HashMap<>();

    /**
     * Map with key as long url and value as tiny url
     */
    private static final Map<String, String> longUrlToTinyUrlMapping = new HashMap<>();

    /**
     * Base url for tiny url
     */
    private static final String BASE_HOST = "https://tinyurl.com/";

    /**
     * @param longUrl long url
     * @return get tiny url for given long url
     */
    public String encode(String longUrl) {
        if (longUrlToTinyUrlMapping.containsKey(longUrl)) {
            return longUrlToTinyUrlMapping.get(longUrl);
        }

        String tinyUrl = getTinyUrl();

        // If computed tiny url already mapped with different long url, generate again till we find unique one
        while (tinyUrlToLongUrlMapping.containsKey(tinyUrl)) {
            tinyUrl = getTinyUrl();
        }

        tinyUrlToLongUrlMapping.put(tinyUrl, longUrl);
        longUrlToTinyUrlMapping.put(longUrl, tinyUrl);
        return tinyUrl;
    }

    /**
     * @param tinyUrl tiny url
     * @return get long url for the given tiny url
     */
    public String decode(String tinyUrl) {
        return tinyUrlToLongUrlMapping.get(tinyUrl);
    }

    /**
     * @return get tiny url of 6 random chars based on base62 chars
     */
    private String getTinyUrl() {
        char[] code = new char[6];
        for (int i = 0; i < code.length; i++) {
            code[i] = chars.charAt((int) (Math.random() * 62));
        }

        return BASE_HOST + String.valueOf(code);
    }
}
