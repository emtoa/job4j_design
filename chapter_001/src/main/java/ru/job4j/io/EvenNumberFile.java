package ru.job4j.io;

import java.io.FileInputStream;

public class EvenNumberFile {

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("io_file/event.txt")) {
            StringBuilder text = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                text.append((char) read);
            }

            String[] lines = text.toString().split(System.lineSeparator());

            for (String line : lines) {
                int result = Integer.parseInt(line.toString());
                System.out.println(result % 2 == 0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

