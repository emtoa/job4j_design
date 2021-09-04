package ru.job4j.io;

import org.junit.Test;

import java.nio.file.Paths;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConfigTest {

    @Test
    public void whenPairWithoutComment() {
        String path = "./data/pair_without_comment.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("name"),is("Aleksandr"));
        assertThat(config.value("pass"),is("Figa"));
    }
}