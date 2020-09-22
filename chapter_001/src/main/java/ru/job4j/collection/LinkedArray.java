package ru.job4j.collection;

import java.util.*;

public class LinkedArray<E> implements Iterable<E> {

    static class Node<U> {

        int index = -1;
        U item;
        Node<U> next;

        public Node() {
            this.index = -1;
            this.item = null;
            this.next = null;
        }

        public Node (int index, U item, Node<U> next) {
            this.index = index;
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return this.item == null && this.next == null;
        }
    }

    private Node<E> top = new Node<>();
    private Node<E> topMain = new Node<>();
    private int modCount = 0; //счетчит изменений

    public E get(int index) {
            top = topMain;
        while (!top.end()) {
            Node<E> tmp = pop();
            if (tmp.index == index) {
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
        topMain = new Node(topMain.index + 1, value, topMain);
        modCount++;
    }

    public int indx() {
        return topMain.index;
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> itr = new Iterator<E>() {
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
                return (E) get(indexIterator++);
            }
        };
        return itr;
    }
}