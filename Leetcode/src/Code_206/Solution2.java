package Code_206;

/**
 * 链表反转， 递归实现
 * @author guofeng
 *
 */
public class Solution2 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode rev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return rev;
	}
}
