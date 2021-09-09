package mytest;

import java.util.Iterator;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        Iterator<Iterator<Integer>> data = List.of(
                List.of(1, 2, 3).iterator(),
                List.of(4, 5, 6).iterator(),
                List.of(7, 8, 9).iterator()
        ).iterator();

        while (data.hasNext()) {
            Iterator<Integer> data1 = data.next();
            while (data1.hasNext()) {
                System.out.println(data1.next());
            }
        }
    }
}
