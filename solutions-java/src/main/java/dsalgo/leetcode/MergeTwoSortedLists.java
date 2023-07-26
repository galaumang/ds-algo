package dsalgo.leetcode;

import dsalgo.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {
    /**
     * mergeTwoLists - merges the two input lists into one and returns back.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode head = new ListNode(0);
      ListNode point = head;
      while (list1 != null && list2 != null) {
        if (list1.val > list2.val) {
          point.next = list2;
          list2 = list1;
          list1 = point.next.next;
        } else {
          point.next = list1;
          list1 = list1.next;
        }
        point = point.next;
      }
      if (list1 != null)
        point.next = list1;
      else
        point.next = list2;
      return head.next;
  }
}