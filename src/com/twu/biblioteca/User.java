package com.twu.biblioteca;

public class User {


    private  String name;
    private  String libraryNo;
    private  String password;
    private  String email;
    private  String phone;


    public User(String name, String libraryNo, String password, String email, String phone) {

        this.name = name;
        this.libraryNo = libraryNo;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }

    public String getLibraryNo(){
        return this.libraryNo;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryNo(String libraryNo) {
        this.libraryNo = libraryNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
