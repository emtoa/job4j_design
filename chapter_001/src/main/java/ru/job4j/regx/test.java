package ru.job4j.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java1");
        found = mat.matches();

        if (found)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
