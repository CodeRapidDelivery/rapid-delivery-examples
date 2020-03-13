package com.rapiddelivery.example;

import java.util.List;

public class HelpfulNullPointerExceptions {

    public static void main(String[] args) {
        var service = new UserService();
        System.out.println(service.getUser(0).getName().toUpperCase());
    }
}

class UserService {
    private final List<User> users = List.of(null, new User(1L, "John"));

    User getUser(long id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

class User {
    private final long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}