package Stack;

public interface Stack<E> {
	void push();
	E pop();
	E peek();
	int getSize();
	boolean isEmpty();
}
