package week03;

/**
 * 数组实现队列
 * @author guofeng
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
	private Array<E> array;
	public ArrayQueue(int capacity) {
		array = new Array<>(capacity);
	}
	
	public ArrayQueue() {
		array = new Array<>();
	}
	
	
	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		array.addLast(e);
		
	}

	@Override
	public E dequeue() {
		return array.removeFirst();
	}

	@Override
	public E getFront() {
		return array.getFirst();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Queue: ");
		sb.append('[');
		for (int i = 0; i < array.getSize(); i++) {
			sb.append(array.get(i));
			if (i != array.getSize() - 1) {
				sb.append(", ");
			}
		}
		sb.append("] ");
		return sb.toString();
	}
}
