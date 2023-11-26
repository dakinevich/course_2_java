public abstract class ArrayQueueADT {
    // Объявление переменных
    protected int[] queue;
    protected int front;
    protected int rear;
    protected int size;

    // Объявление методов
    public abstract void enqueue(int item);
    public abstract int dequeue();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void clear();
}
