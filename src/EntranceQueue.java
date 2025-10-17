import java.util.*;

public class EntranceQueue<E> extends AbstractQueue<E> {

    private E[] data;
    private int front;
    private int rear;

    private int capacity;
    private int size;

    public EntranceQueue() {
        capacity = 1;
        data = (E[]) new Object[capacity];
        size = 0;

        front = -1;
        rear = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(E e) {
        if(size + 1 > capacity) {
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        data[rear] = e;
        return true;
    }

    @Override
    public E poll() {
        if(size - 1 < 0) {
            return null;
        }
        size--;
        E temp = data[front];
        front = (front + 1) % capacity;
        return temp;
    }

    @Override
    public E peek() {
        if(size == 0) {
            return null;
        }
        else {
            return data[front];
        }
    }
    public void reallocate() {
        capacity = capacity * 2;
        E[] newData = (E[]) new Object[capacity];

        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;

    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size - 1; i++) {
            str += data[(front + i) % capacity] + ", ";
        }
        str += data[(front + size - 1) % capacity] + "]";

        return str;

    }
}
