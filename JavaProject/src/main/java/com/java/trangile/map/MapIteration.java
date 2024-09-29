package com.java.trangile.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>() ;
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        //Iterating over keys or values using keySet() and values() methods
        Set<Integer> setmap=map1.keySet();
        for (Integer i:setmap){
            System.out.println("key: " + i);
            System.out.println(map1.get(i));
        }
        System.out.println("===Iterating over Map.entrySet() using For-Each loop ====");
        //2. Iterating over Map.entrySet() using For-Each loop :
        for(Map.Entry<Integer,String> entryset:map1.entrySet()){
            System.out.println(entryset.getKey()+":"+entryset.getValue());
        }
        System.out.println("===Iterating using iterators over Map.Entry<K, V>====");
        //3. Iterating using iterators over Map.Entry<K, V>
        Iterator<Map.Entry<Integer, String>> itr = map1.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        System.out.println("===forEach(action) method to iterate map====");
        //Using Java 8
        // forEach(action) method to iterate map
        map1.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));


    }
}
