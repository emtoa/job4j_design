package ru.job4j.collection;

import java.util.*;

public class SimpleArray<T> implements Iterable<T> {

    private Object[] container = new Object[10];
    private int modCount = 0; //счетчит изменений
    private int indx = 0;

    public T get(int index) {
        if (Objects.checkIndex(index, indx) == index) {
            return (T) container[index];
        }
        return (T) null;
    }

    public void add(T model) {
        if (indx >= this.indx) {
            addContainer();
        }
        container[indx++] = model;
        modCount++;
    }

    public void addContainer() {
        Object[] containerTemp = new Object[container.length + 1];
        System.arraycopy(container,0, containerTemp, 0, container.length);
        container = Arrays.copyOf(containerTemp, containerTemp.length);
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T> itr = new Iterator<T>() {
            private int indexIterator = 0;
            private int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return indexIterator < indx;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return (T) container[indexIterator++];
            }
        };
        return itr;
    }
}