package Code_160;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

/**
 * 相交链表
 * @author guofeng
 *
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		ListNode lA = headA;
		ListNode lB = headB;
		while(lA != lB) {
			lA = lA == null ? lB: lA.next;
			lB = lB == null ? lA: lB.next;
		}
		return lA;
	}
}
