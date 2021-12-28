package Code_138;

import java.util.HashMap;
import java.util.Map;

/**
 * 复制带随机指针的链表
 * 
 * @author guofeng
 *
 */

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class Solution {
	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<>();
		Node cur = head;
		while (cur != null) {
			map.put(cur, new Node(cur.val));
			cur = cur.next;
		}

		cur = head;
		while (cur != null) {
			map.get(cur).next = map.get(cur.next);
			map.get(cur).random = map.get(cur.random);
			cur = cur.next;
		}
		return map.get(head);

	}
}
