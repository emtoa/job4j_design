package ru.job4j.generic;

import java.util.ArrayList;
import java.util.List;

public final class MemStore<T extends Base> implements Store<T> {

    private final List<T> mem = new ArrayList<>();

    @Override
    public void add(T model) {
        mem.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        return mem.set(id, model);
    }

    @Override
    public boolean delete(String id) {
        return mem.remove(id);
    }

    @Override
    public T findById(String id) {
        return mem.get(id);
    }
}