package ru.job4j.io;

import org.junit.Test;

import java.net.URL;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class ConfigTest {

    @Test
    public void whenPairWithComment() {
        URL path = ClassLoader.getSystemResource("./data/pair_without_comment.properties");
        Config config = new Config(path.getPath());
        config.load();
        assertThat(config.value("name"), is("Aleksandr"));
        assertThat(config.value("pass"), is("Figa"));
    }

    @Test
    public void whenPairWithoutComment() {
        URL path = ClassLoader.getSystemResource("./data/pair_without_comment.properties");
        Config config = new Config(path.getPath());
        config.load();
        assertThat(config.value("ip"), is(nullValue()));
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenPairWithoutKey() {
        URL path = ClassLoader.getSystemResource("./data/pair_without_comment.properties");
        Config config = new Config(path.getPath());
        config.load();
        assertThat(config.value(""), is("Aleksandr"));
    }
}