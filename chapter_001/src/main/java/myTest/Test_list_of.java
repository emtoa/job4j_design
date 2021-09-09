package mytest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test_list_of {

    public static List<String> arr = new ArrayList<>();

    public static void display() {
        for (int i = 0; i < arr.size(); i++) {

            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {

        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        arr.add("five");

        arr.replaceAll(String::toUpperCase);

        List<String> arrUpdate = List.of("TWO", "FOUR");

        display();
        //arr.replaceAll(arrUpdate);
        //arr.retainAll(arrUpdate);

        arr.removeIf(s -> s.equals("TWO"));

        System.out.println("");
        System.out.println("########################################################################");

        display();
    }
}
