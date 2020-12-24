package ru.job4j.collection;

import java.util.Iterator;

public class SimpleStack<T> {
    private ForwardLinked<T> linked = new ForwardLinked<T>();

    public T pop() {
        Iterator<T> it = linked.iterator();
        T getIt = it.next();
        linked.deleteLast();
        return getIt;
    }

    public void push(T value) {
        linked.add(value);
    }
}