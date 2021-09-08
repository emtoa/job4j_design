package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Config {

    private final String path;
    private final Map<String, String> values = new HashMap<String, String>();
    private String[] strSetting;

    public Config(final String path) {
        this.path = path;
    }

    public void load() {

        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            List<String> stt = read.lines().collect(Collectors.toList());
            for (String str : stt) {
                strSetting = str.split("=");
                if (strSetting.length == 2) {
                    values.put(strSetting[0], strSetting[1]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String value(String key) {
        if (key.equals("")) {
            throw new IllegalArgumentException("Invalid key");
        }
        return values.get(key);
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Config cnf = new Config("./data/pair_without_comment.properties");
        cnf.load();
    }

}
