package week04;

public class Main {
	public static void main(String[] args) {
//		LinkedList<Integer> linkedList = new LinkedList<>();
//		for(int i = 0; i < 5; i ++) {
//			linkedList.addFirst(i);
//			System.out.println(linkedList);
//		}
//		linkedList.add(2, 888);
//		System.out.println(linkedList);
//		linkedList.remove(2);
//		System.out.println(linkedList);
//		
//		linkedList.removeFirst();
//		System.out.println(linkedList);
//		
//		linkedList.removeLast();
//		System.out.println(linkedList);
		
		
//		LinkedListStack<Integer> linkedList = new LinkedListStack<>();
//		for(int i = 0; i < 5; i ++) {
//			linkedList.push(i);
//			System.out.println(linkedList);
//		}
//		
//		linkedList.pop();
//		System.out.println(linkedList);
		
		// 队列测试
		
		// 队列测试
		LinkedListQueue<Integer>  queue= new LinkedListQueue<>();
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i);
			System.out.println(queue);
		}
		queue.dequeue();
		System.out.println(queue);
	}
}
