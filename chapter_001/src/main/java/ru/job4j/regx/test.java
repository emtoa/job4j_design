package ru.job4j.regx;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {

        List<String> words = List.of("foolish", "php");

        String str  = "hello foolish dude java job4j php";
        String wResult;
        System.out.println(str);

        str.lines().flatMap(line -> Stream.of(line.split("\\s+")))
                .filter(word -> !words.contains(word))
                .map(word -> word + " ")
                .forEach(System.out::print);



/*
        StringJoiner sResult = new StringJoiner(";");

        sResult.add("ddd");

        System.out.println(sResult.length());

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

 */
    }
}
