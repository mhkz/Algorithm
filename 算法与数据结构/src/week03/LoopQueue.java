package week03;

/*
 * 循环队列
 * 
 * 设置两个指针，一个指向队列头 front, 一个指向队列尾 tail
 * tail == front 则认为队列为空
 * tail + 1 == front 则为队列满
 * (tail + 1) % capacity == front 队列满
 * 浪费一个空间
 * 求tail 的位置
 * 
 */
public class LoopQueue<E> implements Queue<E> {
	private E[] data;
	private int front, tail;
	private int size;

	public LoopQueue(int capacity) {
		data = (E[]) new Object[capacity + 1];
		front = 0;
		size = 0;
		tail = 0;
	}

	public LoopQueue() {
		this(10);
	}

	public int getCapacity() {
		return data.length - 1;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return tail == front;
	}

	@Override
	public E getFront() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue");
		}
		return data[front];
	}

	@Override
	public void enqueue(E e) {
		if ((front == (tail + 1) / data.length)) {
			resize(getCapacity() * 2);
		}
		data[tail] = e;
		tail = (tail + 1) % data.length;
		size++;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue");
		}
		E e = data[front];
		front = (front + 1) % data.length;
		size--;
		if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
			resize(getCapacity() / 2);
		}

		return e;
	}

	/**
	 * 数组动态扩容
	 */
	private void resize(int capacity) {
		E[] newData = (E[]) new Object[capacity + 1];
		for (int i = 0; i < size; i++) {
			newData[i] = data[(front + i) % data.length];
		}
		data = newData;
		tail = size;
		front = 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Queue: size = %d, capacity = %d\n", size, getCapacity()));
		sb.append(" front [");

		for (int i = front; i != tail; i = (i + 1) % data.length) {
			sb.append(data[i]);
			if ((i + 1) % data.length != tail) {
				sb.append(", ");
			}
		}
		sb.append("] tail");
		return sb.toString();
	}

}
