package mytest;

public class Generic1<E> {
    Object[] obj;
    int index = 0;

    public Generic1(int size) {
        this.obj = new Object[size];
    }

    public void add(E value) {
        this.obj[index++] = value;
    }

    public E get(int posistion) {
        return (E) this.obj[posistion];
    }
}
