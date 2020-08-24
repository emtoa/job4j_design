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
        mem.set(findByIndex(id), model);
        return (findByIndex(id) != -1) ? true : false;
    }

    @Override
    public boolean delete(String id) {
        mem.remove(findByIndex(id));
        return (findByIndex(id) == -1) ? true : false;
    }

    @Override
    public T findById(String id) {
        int index = findByIndex(id);
        return (index != -1) ? mem.get(index) : null;
    }

    public int findByIndex(String id) {
        return mem.indexOf(id);
    }
}