package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray <T> implements Iterable <T> {
    Object[] obj;
    private int indx = 0;
    private int count;

    public SimpleArray(int size) {
        this.obj = new Object[size];
        this.count = this.obj.length;
    }

    public void add(T model) {
        if (Objects.checkIndex(this.indx, this.count) == this.indx) {
            this.obj[this.indx++] = model;
        }
    }

    public void set (int index, T model){
        if (Objects.checkIndex(index, this.count) == index) {
            this.obj[index] = model;
        }
    }

    public void remote(int index) {
     if (Objects.checkIndex(index, this.count) == index) {
         for (int i = index; i < indx - 1; i++) {
             this.obj[i] = this.obj[i + 1];
         }
     }
    }


    public T get(int index) {
        if (Objects.checkIndex(index, count) == index) {
            return (T) this.obj[index];
        }
        return (T) null;
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T> itr = new Iterator<T>() {
            private int indexIterator = 0;


         @Override
          public boolean hasNext() {
             return indexIterator < count;
          }

           @Override
           public T next() {
               if (!hasNext()) {
                   throw new NoSuchElementException();
               }
               return (T) obj[indexIterator++];
           }
        };
    }
}
