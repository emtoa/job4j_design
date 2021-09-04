package ru.job4j.regx;

import myTest.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SJoiner {

    public static void main(String[] args) {
        List<User> luser = Arrays.asList(
                new User("Leha", 1, null),
                new User("Sava", 2, null),
                new User("Jeha", 3, null)
        );

        String str = luser.stream()
                .map(User::getName)
                .collect(Collectors.joining(" | "));

        System.out.println(str);
    }
}
