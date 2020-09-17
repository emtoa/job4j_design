package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class LinkedArrayTest{
    @Test
    public void whenAddThenGet() {
        LinkedArray<String> array = new LinkedArray<>();
        array.add("first");
        String rsl = array.get(0);
        assertThat(rsl, is("first"));
    }

    @Test
    public void whenAddThenIt() {
        LinkedArray<String> array = new LinkedArray<>();
        array.add("first");
        String rsl = array.iterator().next();
        assertThat(rsl, is("first"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenGetEmpty() {
        LinkedArray<String> array = new LinkedArray<>();
        array.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenGetOutBound() {
        LinkedArray<String> array = new LinkedArray<>();
        array.add("first");
        array.get(1);
    }

    @Test(expected = NoSuchElementException.class)
    public void whenGetEmptyFromIt() {
        LinkedArray<String> array = new LinkedArray<>();
        array.iterator().next();
    }

    @Test (expected = ConcurrentModificationException.class)
    public void whenCorruptedIt() {
        LinkedArray<String> array = new LinkedArray<>();
        array.add("first");
        Iterator<String> it = array.iterator();
        array.add("second");
        it.next();
    }

    @Test
    public void whenAddThenMoreSize() {
        LinkedArray<String> array = new LinkedArray<>();
        array.add("first");
        array.add("second");
        array.add("three");
        array.add("four");
        array.add("five");
        array.add("six");
        array.add("seven");
        array.add("eight");
        array.add("nine");
        array.add("ten");
        array.add("eleven");
        array.add("twelve");

        Iterator<String> itr = array.iterator();

        assertThat(itr.next(), is("first"));
        assertThat(itr.next(), is("second"));
        assertThat(itr.next(), is("three"));
        assertThat(itr.next(), is("four"));
        assertThat(itr.next(), is("five"));
        assertThat(itr.next(), is("six"));
        assertThat(itr.next(), is("seven"));
        assertThat(itr.next(), is("eight"));
        assertThat(itr.next(), is("nine"));
        assertThat(itr.next(), is("ten"));
        assertThat(itr.next(), is("eleven"));
        assertThat(itr.next(), is("twelve"));

    }
}