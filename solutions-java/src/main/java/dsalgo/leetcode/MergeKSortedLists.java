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
public class MergeKSortedLists {
    /**
     * mergeTwoLists - merges the two input lists into one and returns back.
     */
    public ListNode mergeTwoLists(ListNode one, ListNode two) {
        // mergeTwoLists - merges the two input lists into one and returns back.
        ListNode head = new ListNode(0);
        ListNode point = head;
        while (one != null && two != null) {
            if (one.val > two.val) {
                point.next = two;
                two = one;
                one = point.next.next;
            } else {
                point.next = one;
                one = one.next;
            }
            point = point.next;
        }
        if (one != null)
            point.next = one;
        else
            point.next = two;
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        int last = lists.length - 1;
        while (last != 0) {
            int i = 0, j = last;
            // (i, j) forms a pair
            while (i < j) {
                // merge List i with List j and store merged list in List i
                lists[i] = mergeTwoLists(lists[i], lists[j]);
                // consider next pair
                i++;
                j--;
                // If all pairs are merged, update last
                if (i >= j)
                    last = j;
            }
        }
        return lists[0];
    }
}