package Code_142;

/**
 * 142. 环形链表 II
 * 
 * @author guofeng
 * @link https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode fast = head;
		ListNode slow = head.next;
		while(fast != null) {
			slow = slow.next;
			if(fast.next != null) {
				fast = fast.next.next;
			} else {
				return null;
			}
			if(fast == slow) {
				fast = head;
				while(fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}
}
