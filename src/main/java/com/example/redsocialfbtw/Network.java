package com.example.redsocialfbtw;

public abstract class Network {
    String userName;
    String password;

    Network() {}


    public boolean post(String message) {
        if(logIn(this.userName, this.password)){
            boolean result = sendMessage(message.getBytes());
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendMessage(byte[] data);
}
