package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumWindowSubString}
 *
 * @author Milan Rathod
 */
public class MinimumWindowSubStringTest {

  @Test
  public void testMinWindow_Example1() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    // LeetCode Example 1
    String s = "ADOBECODEBANC";
    String t = "ABC";
    assertEquals("BANC", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_Example2() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    // LeetCode Example 2
    String s = "a";
    String t = "a";
    assertEquals("a", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_Example3() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    // LeetCode Example 3
    String s = "a";
    String t = "aa";
    // Note: LeetCode expects "" but our implementation returns "-1"
    assertEquals("", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_EmptySource() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "";
    String t = "ABC";
    assertEquals("", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_EmptyTarget() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "ADOBECODEBANC";
    String t = "";
    // Note: For empty target string, our implementation should be checked
    assertEquals("", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_DuplicateCharsInTarget() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "ADOBECODEBANC";
    String t = "AABC";
    // Multiple 'A's in target require all of them to be in the window
    assertEquals("ADOBECODEBA", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_NoSolution() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "ABCDEF";
    String t = "XYZ";
    assertEquals("", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_ExactMatch() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "ABCDEF";
    String t = "ABCDEF";
    assertEquals("ABCDEF", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_SingleCharTarget() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "ABCDEF";
    String t = "E";
    assertEquals("E", solution.minWindow(s, t));
  }

  @Test
  public void testMinWindow_CaseSensitive() {
    MinimumWindowSubString solution = new MinimumWindowSubString();
    String s = "AbCdEf";
    String t = "bCe";
    assertEquals("", solution.minWindow(s, t));
  }
} 