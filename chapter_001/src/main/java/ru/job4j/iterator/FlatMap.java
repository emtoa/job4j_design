package ru.job4j.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FlatMap<T> implements Iterator<T> {
    private final Iterator<Iterator<T>> data;
    private Iterator<T> cursor;
    private T item = null;

    public FlatMap(Iterator<Iterator<T>> data) {
        this.data = data;
        this.cursor = data.next();
    }

    @Override
    public boolean hasNext() {
        if (item == null) {
            item = valueOf();
        }
        return (item != null) ? true : false;
    }

    @Override
    public T next() {
        T iNext;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        iNext = item;
        item = null;
        return iNext;
    }

    public T valueOf() {
        T result = null;
        try {
            result = this.cursor.next();
        } catch (NoSuchElementException exception) {
            try {
                this.cursor = data.next();
            } catch (NoSuchElementException exceptionSecond) {
                return null;
            }
        }
        return (result != null) ? result : this.cursor.next();
    }

    public static void main(String[] args) {
        Iterator<Iterator<Integer>> data = List.of(
                List.of(1, 2, 3).iterator(),
                List.of(4, 5, 6).iterator(),
                List.of(7, 8, 9).iterator()
        ).iterator();
        FlatMap<Integer> flat = new FlatMap<>(data);
        while (flat.hasNext()) {
            System.out.println(flat.next());
        }
    }
}