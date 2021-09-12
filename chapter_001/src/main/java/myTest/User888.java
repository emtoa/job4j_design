package mytest;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class User888 {
    private String name;
    private int children;
    private Calendar birthday;

    public User888(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
        return true;
        }

        if (!(o instanceof User888)) {
            return false;
        }

        User888 tmpUser = (User888) o;

        return tmpUser.name == this.name
                && tmpUser.children == this.children
                && tmpUser.birthday == this.birthday;
    }

    @Override
    public int hashCode() {

        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + children;
        result = 31 * result + birthday.hashCode();
        return result;

    }

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(1992, 03, 01);
        User888 user1 = new User888("name_1", 1, calendar);
        User888 user2 = new User888("name_1", 1, calendar);

        Map<User888, Object> map1 = new HashMap<>();

        map1.put(user1, new Object());
        map1.put(user2, new Object());

        System.out.println("map1 = " + map1.get(user1));
    }
}
