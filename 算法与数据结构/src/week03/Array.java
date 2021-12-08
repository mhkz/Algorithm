package week03;

public class Array<E> {
	  private E[] data;
	  private int size;

	  /**
	   * 
	   * @param capacity
	   *                 传入数组容量
	   */
	  public Array(int capacity) {
	    data = (E[]) new Object[capacity];
	    size = 0;
	  }

	  public Array() {
	    this(10);
	  }

	  public int getSize() {
	    return size;
	  }

	  // 获取数组容量
	  public int getCapacity() {
	    return data.length;
	  }

	  // 向数组中添加元素
	  public void addLast(E e) {
	    // if (size == data.length) {
	    // throw new IllegalArgumentException("add failed, array is full");
	    // }
	    // data[size] = e;
	    // size++;
	    add(size, e);
	  }

	  public boolean isEmpty() {
	    return size == 0;
	  }

	  // 向数组中指定位置添加元素
	  public void add(int index, E e) {

	    if (index < 0 || index > size) {
	      throw new IllegalArgumentException("add failed, require index >= 0 并且 index <= size");
	    }
	    if (size == data.length) {
	      resize(2 * data.length);
	    }
	    for (int i = size - 1; i >= index; i--) {
	      data[i + 1] = data[i];
	    }
	    data[index] = e;
	    size++;
	  }

	  private void resize(int newCapacity) {
	    E[] newData = (E[]) new Object[newCapacity];
	    for (int i = 0; i < size; i++) {
	      newData[i] = data[i];
	    }
	    data = newData;
	  }

	  public E get(int index) {
	    if (index < 0 || index > size) {
	      throw new IllegalArgumentException("add failed, require index >= 0 并且 index <= size");
	    }
	    return data[index];
	  }

	  public E getFirst(int index) {
	    return get(0);
	  }

	  public E getLast() {
	    return get(size - 1);
	  }

	  public void set(int index, E e) {
	    if (index < 0 || index > size) {
	      throw new IllegalArgumentException("add failed, require index >= 0 并且 index <= size");
	    }
	    data[index] = e;
	  }

	  public boolean contains(E e) {
	    for (int i = 0; i < size; i++) {
	      if (data[i] == e) {
	        return true;
	      }
	    }
	    return false;
	  }

	  public int find(E e) {
	    for (int i = 0; i < size; i++) {
	      if (data[i] == e) {
	        return i;
	      }
	    }
	    return -1;
	  }

	  // 从数组中删除元素
	  public E remove(int index) {
	    if (index < 0 || index > size) {
	      throw new IllegalArgumentException("add failed, require index >= 0 并且 index <= size");
	    }
	    E ret = data[index];
	    for (int i = index + 1; i < size; i++) {
	      data[i - 1] = data[i];
	    }
	    size--;
	    data[size] = null;
	    return ret;
	  }

	  public E removeFirst() {
	    return remove(0);
	  }

	  public E removeLast() {
	    return remove(size - 1);
	  }

	  public void removeElement(E e) {
	    int index = find(e);
	    if (index != -1) {
	      remove(index);
	    }
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(String.format("Array: size = %d, capacity=%d\n", size, data.length));
	    sb.append("[");
	    for (int i = 0; i < size; i++) {
	      sb.append(data[i]);
	      if (i != size - 1) {
	        sb.append(", ");
	      }
	    }
	    sb.append("]");
	    return sb.toString();
	  }
	}
