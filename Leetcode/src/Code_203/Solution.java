package Code_203;

public class Solution {
   public ListNode removeElements(ListNode head, int val) {
	   if(head == null) {
		   return null;
	   }
	   // 使用虚拟头节点
	   while(head != null && head.val == val) {
		   ListNode delNode = head;
		   head = head.next;
		   delNode.next = null;
	   }
	   
	   ListNode prev = head;
	   while(prev.next != null) {
		   if(prev.next.val == val) {
			   ListNode delNode = prev.next;
			   prev.next = delNode.next;
			   delNode.next = null;
		   } else {
			   prev = prev.next;
		   }
	   }

	   return head;
    }
}
