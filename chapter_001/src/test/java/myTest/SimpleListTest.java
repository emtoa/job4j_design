package mytest;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleListTest {

    public class A { }
    public class B extends A { }
    public class C extends B { }

    @Test
    public void whenCreate() {
        SimpleList<B> list = new SimpleList<>(10);
        //list.set(new A());
        list.set(new B());
        list.set(new C());
        print(list);
        printUpper(list);
        printLower(list);
    }

    public void print(SimpleList<?> list) {

    }

    public void printUpper(SimpleList<? extends B> list) {

    }

    public void printLower(SimpleList<? super B> list) {

    }
}