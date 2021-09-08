package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Analizy {

    private StringJoiner sResult;
    private Pattern p = Pattern.compile("^(\\d{3})\\s{1}(.+)$");;
    private Matcher m;

    public void unavailable(String source, String target) {

        try (PrintWriter out = new PrintWriter(new FileOutputStream(target))) {

            BufferedReader read = new BufferedReader(new FileReader(source));

            List<String> stt = read.lines().collect(Collectors.toList());

            sResult = new StringJoiner(";");

            for (String str : stt) {
                m = p.matcher(str);
                if (m.find()) {

                    if (sResult.length() <= 0
                            && (m.group(1).toString().equals("400")
                            || m.group(1).toString().equals("500"))) {
                        sResult.add(m.group(2).toString());
                    }

                    if (sResult.length() > 0 && m.group(1).toString().equals("200")) {
                        sResult.add(m.group(2).toString());
                        out.println(sResult);
                        sResult = new StringJoiner(";");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Analizy anlz = new Analizy();
        anlz.unavailable("./data/20210906.log", "./data/unavailable.csv");
    }
}
