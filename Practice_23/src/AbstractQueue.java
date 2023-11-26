public abstract class AbstractQueue<E> {
    protected Node<E> head;
    protected Node<E> tail;

    protected static class Node<E> {
        E item;
        Node<E> next;

        Node(E item) {
            this.item = item;
        }
    }

    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
        return true;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        for (Node<E> x = head; x != null; x = x.next) {
            size++;
        }
        return size;
    }
}

