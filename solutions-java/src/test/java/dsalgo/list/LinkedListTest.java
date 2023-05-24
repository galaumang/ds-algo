package dsalgo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
  @Test
  void defaultConstructorTest() {
    LinkedList<Integer> integerLinkedList = new LinkedList<>();
    assertNull(integerLinkedList.head);
  }

  @Test
  void constructorTest() {
    LinkedList<Integer> integerLinkedList = new LinkedList<>(new ListNode<>(9));
    assertEquals(9, (int) integerLinkedList.head.value);
  }

  @Test
  void createNullOrEmptyTest() {
    assertNull(LinkedList.create(null).head);
    assertNull(LinkedList.create(new int[]{}).head);
  }

  @Test
  void createTest() {
    assertEquals(9, (int) LinkedList.create(new int[]{9}).head.value);
  }

  @Test
  void insertAtEndTest() {
    LinkedList<Integer> integerLinkedList = new LinkedList<>(new ListNode<>(9));
    integerLinkedList.insertAtEnd(18);
    assertEquals(18, (int) integerLinkedList.head.next.value);
  }

  @Test
  void insertAtEndAtThirdTest() {
    LinkedList<Integer> integerLinkedList = LinkedList.create(new int[]{9, 10});
    integerLinkedList.insertAtEnd(11);
    assertEquals(11, (int) integerLinkedList.head.next.next.value);
  }

  @Test
  void insertAtEndEmptyTest() {
    LinkedList<Integer> integerLinkedList = new LinkedList<>();
    integerLinkedList.insertAtEnd(18);
    assertEquals(18, (int) integerLinkedList.head.value);
  }
}
