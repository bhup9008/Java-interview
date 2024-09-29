package com.java.trangile.kellton.map;

import java.util.HashMap;
import java.util.Map;

public class MainUser {
    public static void main(String[] args) {
        User u1=new User(1,"bhup",101);
        User u2=new User(1,"bhup",101);
        User u3=new User(1,"bhup",101);
        User u4=new User(1,"bhup",101);
        Map<User,String> map=new HashMap<>();
        map.put(u1,"A");
        map.put(u2,"B");
        map.put(u3,"C");
        map.put(u4,"D");
        System.out.println(map);
    }
}
