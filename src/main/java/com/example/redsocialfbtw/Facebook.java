package com.example.redsocialfbtw;

public class Facebook extends Network{
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    boolean logIn(String userName, String password) {
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        System.out.println("\n\n Welcome to Facebook");
        return true;

    }


    boolean sendMessage(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message " + new String(data) + " posted on Facebook");
            return true;
        } else {
            return false;
        }
    }
}
