package Code_234;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	public boolean isPalindrome(ListNode head) {

		// 第一步， 声明快慢指针
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = reverse(slow);
		while (fast != null) {
			if (fast.val != head.val) {
				return false;
			}
			fast = fast.next;
			head = head.next;
		}
		return true;
	}

	// 链表反转
	private ListNode reverse(ListNode head) {
		ListNode prev = null; // 用来记录反转后的链表
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			;
			cur = next;
		}
		return prev;
	}
}
