package week04;

public class LinkedListStack<E> implements Stack<E> {
	private LinkedList<E> list;
	public LinkedListStack() {
		list = new LinkedList<E>();
		
	}
	
	@Override
	public void push(E e) {
		list.addFirst(e);
		
	}

	@Override
	public E pop() {
		
		return list.removeFirst();
	}

	@Override
	public E peek() {
		
		return list.getFirst();
	}

	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack: top");
		sb.append('[');
		for (int i = 0; i < list.getSize(); i++) {
			sb.append(list.get(i));
			if (i != list.getSize() - 1) {
				sb.append(", ");
			}
		}
		sb.append("] ");
		return sb.toString();
	}

}
