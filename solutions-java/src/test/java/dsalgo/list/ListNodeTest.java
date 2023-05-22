package dsalgo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ListNodeTest {
    @Test
    void constructorTest() {
        ListNode<Integer> integerListNode = new ListNode<>(9);
        assertEquals(Integer.valueOf(9), integerListNode.value);
    }
}
