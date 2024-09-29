package com.java.trangile.kellton.map;

import com.java.trangile.map.Customer;

import java.util.Objects;

public class User {
    private int id;
    private String username;
    private int rollno;

    public User(int id, String username, int rollno) {
        this.id = id;
        this.username = username;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User u=(User) obj;

        return id==u.id&&username.equals(u.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}
