package com.example.redsocialfbtw;

public class Twitter extends Network{
    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    boolean logIn(String userName, String password) {
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        System.out.println("\n\nWelcome to Twitter");
        return true;

    }


    boolean sendMessage(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message " + new String(data) + " posted on Twitter");
            return true;
        } else {
            return false;
        }
    }
}
