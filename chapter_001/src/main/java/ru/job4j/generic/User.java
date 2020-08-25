package ru.job4j.generic;

import java.net.UnknownServiceException;

public class User extends Base {

    private String name;

    protected User (String id) {
        super(id);
    }

    public String getName() {
        return name;
    }

}
