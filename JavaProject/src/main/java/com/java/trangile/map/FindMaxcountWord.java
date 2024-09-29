package com.java.trangile.map;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxcountWord {
    public static void main(String[] args) {

        String s="my name is bhupendra";



        String st[]=s.split(" ");

        List<String> list= Arrays.asList(st);
        Map<Integer,String> map=
                list.stream().collect(Collectors.toMap(String::length, Function.identity(),(e1, e2)->e1));



        // String m=
        Map.Entry<Integer,String> maxfindvalue=
                map.entrySet().stream().max(Map.Entry.comparingByKey() ).get();
        Map.Entry<Integer,String> compareKey=

                map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey().reversed()).findFirst().get();
        Map.Entry<Integer,String> compareValue=

                map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).findFirst().get();
        Map.Entry<Integer,String> compareValue1=
                map.entrySet().stream().sorted(getComrator(map)).findFirst().get();
        System.out.println(maxfindvalue.getKey()+" : "+maxfindvalue.getValue());
        System.out.println(compareKey.getKey()+" : "+compareKey.getValue());
        System.out.println(compareValue.getKey()+" : "+compareValue.getValue());
        System.out.println("using comparter"+compareValue1.getKey()+" : "+compareValue1.getValue());



    }

    public static Comparator<Map.Entry<Integer,String>> getComrator(Map<Integer,String> map){
        return (Comparator<Map.Entry<Integer, String>>)
                (c1, c2) -> c2.getKey().compareTo(c1.getKey());
    }
}
