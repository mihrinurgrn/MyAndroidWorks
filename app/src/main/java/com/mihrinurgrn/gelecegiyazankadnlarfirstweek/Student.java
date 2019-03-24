package com.mihrinurgrn.gelecegiyazankadnlarfirstweek;

public class Student {
    private String fullname, username;
    private int age;

    public Student(String fullname, String username, int age) {
        this.fullname = fullname;
        this.username = username;
        this.age = age;
    }


    public Student() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
