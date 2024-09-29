package com.java.trangile.map;

import java.util.Comparator;

public class Sortbyroll implements Comparator<User> {

    @Override
    public int compare(User a, User b) {

        //return a.getRollno() - b.getRollno();//sort by id
        return a.getName().compareTo(b.getName());
    }
}
