package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link AnagramSubStringSearch}
 * <p>
 * Constraints: 1 <= s.length, p.length <= 3 * 10^4
 *
 * @author Milan Rathod
 */
public class AnagramSubStringSearchTest {

  @Test
  public void testFindAnagrams_Example1() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    // Example 1 from LeetCode
    String s = "cbaebabacd";
    String p = "abc";
    List<Integer> expected = Arrays.asList(0, 6);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_Example2() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    // Example 2 from LeetCode
    String s = "abab";
    String p = "ab";
    List<Integer> expected = Arrays.asList(0, 1, 2);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_NoAnagrams() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "hello";
    String p = "xyz";
    List<Integer> expected = Collections.emptyList();
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_SameString() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "abcabc";
    String p = "abc";
    // All anagrams of "abc" in "abcabc" start at indices 0, 1, 2, 3
    List<Integer> expected = Arrays.asList(0, 1, 2, 3);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_PatternLongerThanString() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "abc";
    String p = "abcdef";
    List<Integer> expected = Collections.emptyList();
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_MinLength() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    // Both strings have minimum length 1 (constraint: 1 <= s.length, p.length)
    String s = "a";
    String p = "a";
    List<Integer> expected = Arrays.asList(0);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_LargeLength() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    // Test with larger strings (closer to the constraint: p.length <= 3 * 10^4)
    // Create a string of 1000 'a's and a pattern of 100 'a's
    StringBuilder sBuilder = new StringBuilder();
    StringBuilder pBuilder = new StringBuilder();

    for (int i = 0; i < 1000; i++) {
      sBuilder.append('a');
    }

    for (int i = 0; i < 100; i++) {
      pBuilder.append('a');
    }

    String s = sBuilder.toString();
    String p = pBuilder.toString();

    // Expected: indices 0 to 900 (1000-100)
    List<Integer> expected = new ArrayList<>();
    for (int i = 0; i <= 900; i++) {
      expected.add(i);
    }

    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_AllSameCharacter() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "aaaaa";
    String p = "aa";
    // Anagrams start at indices 0, 1, 2, 3
    List<Integer> expected = Arrays.asList(0, 1, 2, 3);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_SingleCharacter() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "abcdefga";
    String p = "a";
    // 'a' appears at indices 0 and 7
    List<Integer> expected = Arrays.asList(0, 7);
    assertEquals(expected, solution.findAnagrams(s, p));
  }

  @Test
  public void testFindAnagrams_CaseSensitive() {
    AnagramSubStringSearch solution = new AnagramSubStringSearch();
    String s = "AbCdEfG";
    String p = "cba";
    // No matches since case matters
    List<Integer> expected = Collections.emptyList();
    assertEquals(expected, solution.findAnagrams(s, p));
  }
} 