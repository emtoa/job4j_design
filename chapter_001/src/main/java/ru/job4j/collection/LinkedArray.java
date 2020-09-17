package ru.job4j.collection;

import java.util.*;

public class LinkedArray<E> implements Iterable<E> {

    static class Node<U> {

        U item;

        public Node() {
            this.item = null;
        }

        public Node (U item) {
            this.item = item;
        }
    }

    private Node[] container = new Node[10];
    private int modCount = 0; //счетчит изменений
    private int indx = 0;

    public E get(int index) {
        if (Objects.checkIndex(index, indx) == index) {
            return (E) container[index].item;
        }
        return (E) null;
    }

    public void add(E value) {
        if (indx >= container.length) {
            addContainer();
        }
        container[indx++] = new Node(value);
        modCount++;
    }

    public void addContainer() {
        container = Arrays.copyOf(container, container.length + 1);
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> itr = new Iterator<E>() {
            private int indexIterator = 0;
            private int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return indexIterator < indx;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return (E) container[indexIterator++].item;
            }
        };
        return itr;
    }
}