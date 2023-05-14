package dsalgo.list;

/**
 * LinkedList
 * <p>
 * LinkedList implementation that holds head of the list as ListNode
 * </p>
 *
 * @author Umang Gala
 */
public class LinkedList<T> {
    ListNode<T> head;

    /**
     * Default constructor that initialize the head with null
     */
    public LinkedList() {
        head = null;
    }

    /**
     * Initialize the linked list with head node
     *
     * @param head linked list head node
     */
    public LinkedList(ListNode<T> head) {
        this.head = head;
    }

    /**
     * Create an integer Linked list with values in input int array
     *
     * @param list array of values for linked list
     * @return integer linked list
     */
    public static LinkedList<Integer> create(int[] list) {
        if (list == null || list.length == 0)
            return new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int element : list)
            linkedList.insertAtEnd(element);
        return linkedList;
    }

    /**
     * Insert the input value to the end of this list
     *
     * @param value insert value
     */
    public void insertAtEnd(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        newNode.next = null;
        if (this.head == null)
            this.head = newNode;
        else {
            ListNode<T> last = this.head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
        }
    }
}
