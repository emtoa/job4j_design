package ru.job4j.io;

import java.io.FileInputStream;

public class ReadFile {

    public static void main(String[] args) {

        String[] str = "one two three four".split(" ");
        System.out.println(str[1]);
/*
        try (FileInputStream in = new FileInputStream("oi_file/input.txt")) {
            StringBuilder text = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                text.append((char) read);
            }
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

 */
    }
}
