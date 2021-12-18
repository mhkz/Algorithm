package Code_141;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 * 
 * @author guofeng
 *
 */

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Soluation {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<ListNode>();
 		while(head != null) {
 			if(!set.add(head)) {
 				return true;
 			}
 			head = head.next;
 		} 
 		return false;
	}
}
