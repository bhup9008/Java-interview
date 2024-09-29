package com.java.trangile.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"bhup","kumar");
        Customer c2=new Customer(1,"bhup","saini");
        Customer c3=new Customer(3,"mahesh","kumar");
        Customer c4=new Customer(4,"deepak","saini");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c1.equals(c2));

        /*Set<Customer> set=new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        System.out.print(set.size());*/

        Map<Customer,String > map =new HashMap<>();
        map.put(c1,"aaaaaaaaaaaa");
        map.put(c2,"bbbbbbbbbbb");
        map.put(c3,"ccccccccc");
        map.put(c4,"ddddddddddddd");
        map.forEach((x,y)->System.out.println(x+":"+y));
        System.out.println(map);
        System.out.println(map.get(new Customer(1,"bhup","kumar")));
        //map.put(c1,"aaaaaaaaaaaa");



    }
}
