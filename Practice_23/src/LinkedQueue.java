import java.util.NoSuchElementException;
import java.util.Queue;

public class LinkedQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
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

    public E remove() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        E item = head.item;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return item;
    }

    public E element() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.item;
    }

    public E peek() {
        return (head == null) ? null : head.item;
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