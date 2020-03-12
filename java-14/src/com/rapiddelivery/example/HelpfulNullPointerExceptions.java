package com.rapiddelivery.example;

public class HelpfulNullPointerExceptions {

    public static void main(String[] args) {
        System.out.println(new UserService().getUser(0).toString());
    }

    static class UserService {
        User [] users = {null, new User()};
        User getUser(int id) {
            return users[id];
        }
    }

    static class User {
    }
}
