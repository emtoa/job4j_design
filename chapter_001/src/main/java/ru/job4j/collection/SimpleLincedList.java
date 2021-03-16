package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLincedList<T> implements Iterable<T> {

    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<T>(value, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public boolean revert() {
        //TODO impl reverts of linked list.
        if (head == null) {
            return false;
        }

        if (head.next == null) {
            return false;
        }

        Node<T> tmp = new Node<>(null, null);
        while (head != null) {
            Node<T> temp = new Node<>(head.value, tmp);
            head = head.next;
            tmp = temp;
        }
        head = tmp;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = node.value;
                node = node.next;
                return value;
            }
        };
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
