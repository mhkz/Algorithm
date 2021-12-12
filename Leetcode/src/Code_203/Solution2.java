package Code_203;
/**
 * 使用虚拟头节点简化操作
 * @author guofeng
 *
 */
public class Solution2 {
	public ListNode removeElements(ListNode head, int val) {
		if(head == null) {
			return head;
		}
		// 设置虚拟头节点
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
		
		ListNode prev = dummyHead;
		while(prev.next != null) {
			if(prev.next.val == val) {
				prev.next = prev.next.next;
			} else {
				prev = prev.next;
			}
		}
		return dummyHead.next;
	}
}
