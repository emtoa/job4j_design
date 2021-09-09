package mytest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArrayTest {

    public static void main(String[] args) {

        List<String> lists = new ArrayList<>();
        lists.add("One");
        lists.add("two");
        lists.add("three");

        lists.add(1,"error");

        System.out.println(lists.get(0));
        System.out.println(lists.get(1));
        System.out.println(lists.get(2));
    }
}
