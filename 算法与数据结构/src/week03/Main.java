package week03;

public class Main {
	public static void main(String[] args) {
		// 栈测试
//		ArrayStack<Integer> stack = new ArrayStack<>();
//		for (int i = 0; i < 5; i++) {
//			stack.push(i);
//			System.out.println(stack);
//		}
//		stack.pop();
//		System.out.println(stack);
		
		// 队列测试
		ArrayQueue<Integer>  queue= new ArrayQueue<>();
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i);
			System.out.println(queue);
		}
		queue.dequeue();
		System.out.println(queue);
	}
}
