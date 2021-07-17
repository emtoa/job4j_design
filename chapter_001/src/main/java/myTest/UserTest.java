package myTest;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class UserTest {
    public static void main(String[] args) {
        System.out.println("###############");

        Calendar calendar = new GregorianCalendar(1992, 03,01);

        Calendar calendar2 = new GregorianCalendar(1992, 03,01);

        Map<User, String> m = new HashMap<>();
        m.put(new User("name_1", 1, calendar), "Jenny");
        System.out.println(m.get(new User("name_1", 1, calendar2)));

        //System.out.println(m.hashCode());

/*
        Map<String, String> ms = new HashMap<>();

        ms.put("one", "one_1");
        ms.put("two", "two_2");

        System.out.println(ms.get("two"));

 */
    }
}
