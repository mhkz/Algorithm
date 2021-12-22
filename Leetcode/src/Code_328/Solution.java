package Code_328;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
/**
 * 奇偶链表
 * @author guofeng
 *	输入: 1->2->3->4->5->NULL
 *  输出: 1->3->5->2->4->NULL
 */
class Solution {
   public ListNode oddEvenList(ListNode head) {
	   if(head == null) {
		   return null;
	   }
	   ListNode odd = head;
	   ListNode evenHead = head.next, even = evenHead;
	   while(even != null && even.next != null) {
		   odd.next = even.next;
		   odd = odd.next;
		   even.next = odd.next;
		   even = even.next;
	   }
       odd.next = evenHead;
       return head;
   }
}