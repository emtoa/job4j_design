package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private int[] array; //array = new int[7];
    private int point = 0;

    public EvenIterator(int[] array) {
        this.array = array;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int index = indexOf(this.point);
        this.point = index + 1;
        return array[index];
    }

    @Override
    public boolean hasNext() {
        int index = indexOf(this.point);
        if (index == -1) {
            return false;
        }
        return (array[index] % 2 == 0) ? true : false;
    }

    public Integer indexOf(int index) {
        int count = index;
        if (count >= 0 && count < array.length) {
            while (array[count] % 2 == 1) {
                count++;
                if (count >= array.length) {
                    return -1;
                }
            }
        }
        return count;
    }
}
