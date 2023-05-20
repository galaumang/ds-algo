package dsalgo.tree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TrieNodeTest {
    @Test
    void defaultConstructorTest() {
        TrieNode<Character> trieNode = new TrieNode<>();
        assertNotNull(trieNode);
    }

    @Test
    void isLeafAndSetLeafTest() {
        TrieNode<Character> trieNode = new TrieNode<>();
        assertFalse(trieNode.isLeaf());
        trieNode.setLeaf(true);
        assertTrue(trieNode.isLeaf());
    }

    @Test
    void setChildAndGetChildTest() {
        TrieNode<Character> child = new TrieNode<>();
        child.setChild('b', new TrieNode<>());
        assertNotNull(child.getChild('b'));
        assertNull(child.getChild('d'));
    }
}
