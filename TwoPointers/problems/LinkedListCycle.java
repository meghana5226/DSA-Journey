package TwoPointers.problems;

public class LinkedListCycle {
    // Leetcode 141: https://leetcode.com/problems/linked-list-cycle/
//  Detect cycle in a linked list using two pointers (slow and fast).

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}


