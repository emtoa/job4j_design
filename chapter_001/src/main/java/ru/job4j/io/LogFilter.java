package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {

    public static List<String> filter(String file) {

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            return in.lines().filter(a -> a.indexOf("404") != -1)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<String> log = filter("io_file/log.txt");
        log.forEach(System.out::println);
    }
}
