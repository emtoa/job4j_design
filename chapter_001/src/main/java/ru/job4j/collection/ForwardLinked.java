package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardLinked<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> last;

    public void revert() {
        //TODO impl reverts of linked list.

        if (head == null) {
            throw new NoSuchElementException();
        }

        Node<T> tmp;
        if (head == last) {
            tmp = new Node<T>(last.value, null, null);
            head = tmp;
            return;
        }

        tmp = new Node<T>(last.next.value, null, null);

        while (last != null) {
            Node<T> temp =  new Node<T>(last.next.value, last, last.next.next);

            if (last.next.next == null) {
                tmp.prev = null;
                head = tmp;
            } else {
                tmp.prev = tmp;
                tmp.next = temp;
                tmp = tmp.next;
            }
            last = last.prev;
        }
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value, null, null);
        if (head == null) {
            head = node;
            last = node;
            return;
        }
        Node<T> tail = head;

        while (tail.next != null) {
            tail.next.prev = tail;
            tail = tail.next;
        }
        tail.next = node;
        last = tail;
    }

    public T deleteLast() {

        T returnValue;

        if (last == null) {
            throw new NoSuchElementException();
        }

        if (head.next == null) {
            returnValue = head.value;
            head = null;
            last = null;
            return returnValue;
        }

        returnValue = last.next.value;
        Node<T> temp = last;
        last.next = null;
        last = temp;
        return returnValue;
    }

    public void deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> temp = head.next;
        head.next = null;
        head = temp;
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
        Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}