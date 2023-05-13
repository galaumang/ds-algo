package dsalgo.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * TrieNode
 * Object to represent Trie Node
 *
 * @author Umang G
 */
public class TrieNode<K> {
    private boolean leaf;
    private final Map<K, TrieNode<K>> children;

    /**
     * Default constructor - initialize default values
     */
    TrieNode() {
        leaf = false;
        children = new HashMap<>();
    }

    /**
     * Returns the TrieNode of child 'c', if present
     *
     * @param c child character
     * @return TrieNode of child 'c'
     */
    TrieNode<K> getChild(K c) {
        return children.get(c);
    }

    /**
     * Add 'c' as child of this
     *
     * @param c     child character
     * @param child TrieNode of child 'c'
     */
    void setChild(K c, TrieNode<K> child) {
        children.put(c, child);
    }

    /**
     * Set this as leaf node
     *
     * @param flag boolean value
     */
    void setLeaf(boolean flag) {
        leaf = flag;
    }

    /**
     * Return if this is leaf node or not
     *
     * @return boolean value
     */
    boolean isLeaf() {
        return leaf;
    }

}
