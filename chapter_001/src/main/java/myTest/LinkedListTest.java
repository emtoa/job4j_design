package myTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListTest {

    public static void main(String[] args) {
        List<String> lists = new LinkedList<>();
        lists.add("One");
        lists.add("two");
        lists.add("three");

        lists.add(1,"error");

        System.out.println(lists.get(0));
        System.out.println(lists.get(1));
        System.out.println(lists.get(2));
        //System.out.println(lists.get(4));

        Iterator<String> str = lists.iterator();
        System.out.println("#########################################################");
        System.out.println(str.next());
        System.out.println(str.next());
    }
}
