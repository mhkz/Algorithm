package Code_83;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	// 链表的遍历
	@Override
	public String toString() {
		ListNode head = new ListNode();
		StringBuilder sb = new StringBuilder();
		while(head.next != null) {
			sb.append(head + "->");
			head = head.next;
		}
		sb.append("NULL");
		return sb.toString();
	}
}

public class Solution {
	 public static ListNode deleteDuplicates(ListNode head) {
	   
		 if(head == null || head.next == null) {
	            return head;
	        }
	        if (head.val == head.next.val) {
	            head = deleteDuplicates(head.next);
	        } else {
	            head.next = deleteDuplicates(head.next);
	        }
		     return head;
	 }
	 public static void main(String[] args) {
		ListNode list = new ListNode();
		for(int i = 0; i < 5; i ++) {
			list.next = new ListNode(5, list.next);
		}
		
//		while(list.next != null) {
//			list = list.next;
//			int val = list.val;
//			System.out.println("val:"+ val);
//			
//		}
		deleteDuplicates(list);
		while(list.next != null) {
			list = list.next;
			int val = list.val;
			System.out.println("val:"+ val);
			
		}
	}
	 
	 
}
