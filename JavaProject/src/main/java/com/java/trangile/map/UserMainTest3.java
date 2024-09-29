package com.java.trangile.map;


import java.util.*;

public class UserMainTest3 {
    public static void main(String[] args) {

        User u=new User("A",122);
        User u2=new User("B",129);
        User u3=new User("C",120);
        User u4=new User("D",129);
        User u5=new User("E",127);
       // TreeSet<User> treeSet=new TreeSet<User>(new Sortbyroll());
        /*TreeSet<User> treeSet=new TreeSet<>();
        treeSet.add(u);
        treeSet.add(u2);
        treeSet.add(u3);
        treeSet.add(u4);
        treeSet.add(u5);

        treeSet.stream().forEach(x->{System.out.println(x.getName()+":"+x.getRollno());});*/
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("dggdg",null);
        System.out.println(hashtable);
       /* Map<String,String> map=new TreeMap<>();
        map.put("anjna",null);
        System.out.println(map);*/






    }

}
