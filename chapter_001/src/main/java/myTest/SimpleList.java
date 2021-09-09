package mytest;

public class SimpleList<E> {

    Object[] objects;
    private int index = 0;

    public SimpleList(int size) {
        objects = new Object[size];
    }

    public <K> K print(K value) {
        System.out.println(value);
        return value;
    }

    public void set(E value) {
        objects[index] = value;
    }

    public E get(int indx) {
        return (E) objects[indx];
    }
}
