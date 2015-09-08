package com.others;

public class RemoveNthNodeFromEndOfList {
	/**
	 * Given linked list: 1->2->3->4->5, and n = 2.
	 * 
	 * After removing the second node from the end, the linked list becomes
	 * 1->2->3->5.
	 * 
	 * ONE PASS Solution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(2);
		n1.next.next = new ListNode(3);
		n1.next.next.next = new ListNode(4);
		n1.next.next.next.next = new ListNode(5);
		n1 = removeNthFromEnd(n1, 2);
		while (n1 != null) {
			System.out.print(n1.val + "->");
			n1 = n1.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || head.next == null) {
			return null;
		}
		int m = removeNthFromEndUtil(head, n);
		if (m == n) {
			return head.next;
		}
		return head;
	}

	private static int removeNthFromEndUtil(ListNode head, int n) {
		if (head == null) {
			return 0;
		}
		int m = removeNthFromEndUtil(head.next, n);
		if (m == n) {
			head.next = head.next.next;
		}
		return m + 1;
	}

}
