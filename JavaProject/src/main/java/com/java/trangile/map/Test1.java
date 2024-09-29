package com.java.trangile.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("a","aaaaa");
        map.put("b","bbbbbbb");
        map.put("c","cccccccc");
        map.put("a","abc");
        map.put("VolatileA","AAAAA");
        map.put(null,"haaakklal");
        System.out.println(map.get(null));
        System.out.println(map.containsKey(null));
    }
}
