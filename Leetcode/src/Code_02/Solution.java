package Code_02;

/**
 * 两数相加
 * @author guofeng
 *
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 创建虚拟头节点
		ListNode dummyHead = new ListNode(0);
		ListNode cursor = dummyHead;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0) {
			int v1 = l1 != null ? l1.val : 0;
			int v2 = l2 != null ? l2.val : 0;
			int sum = v1 + v2 + carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum % 10);
			cursor.next = node;
			cursor = node;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		return dummyHead.next;
    }
}
