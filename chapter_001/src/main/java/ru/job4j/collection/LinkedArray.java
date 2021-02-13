package ru.job4j.collection;

import java.util.*;

public class LinkedArray<E> implements Iterable<E> {

    private Node<E> top = new Node<>();
    private Node<E> head = new Node<>();
    private int modCount = 0; //счетчит изменений
    private int size = -1;

    public E get(int index) {
        top = head;
        for (int i = size; i >= 0; i--) {
            Node<E> tmp = pop();
            if (i == index) {
                return (E) tmp.item;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Node<E> pop() {
        Node<E> result = top;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public void add(E value) {
        head = new Node(value, head);
        size++;
        modCount++;
    }

    public int indx() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> itr = new Iterator<E>() {
            Node<E> n = head;
            private int indexIterator = 0;
            private int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return indexIterator <= indx();
            }

            @Override
            public E next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }

                E actual = n.item;
                n = n.next;
                return (E) actual;
            }
        };
        return itr;
    }

    static class Node<U> {

        U item;
        Node<U> next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return this.item == null && this.next == null;
        }
    }
}