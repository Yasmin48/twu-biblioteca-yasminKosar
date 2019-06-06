package com.twu.biblioteca;

public class User {


    private final String name;
    private final String username;
    private final String password;


    public User(String name, String username, String password) {

        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }


}
