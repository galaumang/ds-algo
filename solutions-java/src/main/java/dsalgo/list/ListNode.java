package dsalgo.list;

/**
 * ListNode
 * Object to represent List Node
 *
 * @author Umang Gala
 */
public class ListNode<T> {
    T value;
    ListNode<T> next;

    /**
     * Initialize the node with the value
     *
     * @param value value for the node
     */
    ListNode(T value) {
        this.value = value;
        next = null;
    }
}
