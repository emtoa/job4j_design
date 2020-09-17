package ru.job4j.generic;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleListTest {

    @Test
    public void whenArrayInteger() {
        SimpleList<Integer> lists = new SimpleList<>(10);
        lists.set(7);

        assertThat(lists.get(0), is(7));
    }

    @Test
    public void whenArrayFloat() {
        SimpleList<Float> lists = new SimpleList<>(10);
        lists.set(7.1F);

        assertThat(lists.get(0), is(7.1F));

    }
/*
    @Test
    public void whenArrayString() {
        SimpleList<String> lists = new SimpleList<>(10);
        lists.set("test");

        assertThat(lists.get(0), is("test"));
    }
 */

}