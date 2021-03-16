package ru.job4j.collection;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;

public class SimpleLincedListTest {

    @Test
    public void whenAddThenIter() {
        SimpleLincedList<Integer> linked = new SimpleLincedList<>();
        linked.add(1);
        linked.add(2);
        Iterator<Integer> it = linked.iterator();
        assertThat(it.next(), is(1));
        assertThat(it.next(), is(2));
    }

    @Test
    public void whenAddAndRevertThenIter() {
        SimpleLincedList<Integer> linked = new SimpleLincedList<>();
        linked.add(1);
        linked.add(2);
        linked.revert();
        Iterator<Integer> it = linked.iterator();
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(1));
    }

    @Test
    public void whenAdd1AndRevertThenIter() {
        SimpleLincedList<Integer> linked = new SimpleLincedList<>();
        linked.add(1);
        linked.revert();
        Iterator<Integer> it = linked.iterator();
        assertThat(it.next(), is(1));
    }

    @Test
    public void whenAdd4AndRevertThenIter() {
        SimpleLincedList<Integer> linked = new SimpleLincedList<>();
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        linked.revert();
        Iterator<Integer> it = linked.iterator();
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(3));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(1));
    }

    @Test
    public void whenSize0ThenReturnFalse() {
        SimpleLincedList<Integer> emptyList = new SimpleLincedList<>();
        assertFalse(emptyList.revert());
    }

    @Test
    public void whenSize1ThenReturnFalse() {
        SimpleLincedList<Integer> singleList = new SimpleLincedList<>();
        singleList.add(1);
        assertFalse(singleList.revert());
    }

}