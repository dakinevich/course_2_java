import java.util.NoSuchElementException;

public class ArrayQueueModule {
    // Объявление переменных
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Объявление методов
    public void enqueue(int item) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }
}
