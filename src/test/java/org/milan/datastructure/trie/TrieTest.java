package org.milan.datastructure.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link Trie}
 *
 * @author Milan Rathod
 */
class TrieTest {

    @Test
    void testOperations() {
        Trie trie = new Trie();

        trie.insert("apple");

        assertTrue(trie.search("apple"));

        assertFalse(trie.search("app"));

        assertTrue(trie.startsWith("app"));

        trie.insert("app");

        assertTrue(trie.search("app"));
    }

}