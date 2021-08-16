package ru.job4j.io;

import java.io.FileOutputStream;

public class ResultFile {

    public static void main(String[] args) {

       try (FileOutputStream out = new FileOutputStream("result.txt")) {
           int mult;
           String res;
            out.write("Hello, this is multiplication table!".getBytes());
            out.write(System.lineSeparator().getBytes());
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    mult = i * j;
                    res  = Integer.toString(mult);
                    res = " ".repeat(2-res.length()) + res;
                    out.write(res.getBytes());
                    out.write(" | ".getBytes());
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
