package ru.job4j.generic;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

public class SimpleArrayTest {

    @Test
    public void whetRemoveIndex2() {

        SimpleArray<Integer> smp = new SimpleArray<>(5);

        smp.add(1);
        smp.add(2);
        smp.add(3);
        smp.add(4);
        smp.add(5);

        assertThat(smp.get(0), is(1));
        assertThat(smp.get(1), is(2));
        assertThat(smp.get(2), is(3));
        assertThat(smp.get(3), is(4));
        assertThat(smp.get(4), is(5));

        smp.remote(2);

        assertThat(smp.get(0), is(1));
        assertThat(smp.get(1), is(2));
        assertThat(smp.get(2), is(4));
        assertThat(smp.get(3), is(5));
    }

    @Test
    public void whetSetIndex1() {

        SimpleArray<Integer> smp = new SimpleArray<>(5);

        smp.add(1);
        smp.add(2);
        smp.add(3);
        smp.add(4);
        smp.add(5);

        smp.set(1, 6);

        assertThat(smp.get(0), is(1));
        assertThat(smp.get(1), is(6));
        assertThat(smp.get(2), is(3));
        assertThat(smp.get(3), is(4));
        assertThat(smp.get(4), is(5));
    }
}