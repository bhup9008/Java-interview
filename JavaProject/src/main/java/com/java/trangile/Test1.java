package com.java.trangile;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        String str[]={"apple","orange","kiwi","banana","grapes"};
        List<String> liststring= Arrays.asList(str);


        Map<Integer, String> map = Stream.of("bla", "blabla","hjk","sdf", "blablabla").distinct()
                .collect(Collectors.toMap(String::length,Function.identity(),(o1, o2) -> o1));

        map.entrySet().stream().forEach(x->System.out.println(x.getKey()+":::"+x.getValue()));

        liststring.stream()
                .collect(Collectors.groupingBy(String::valueOf,LinkedHashMap::new,Collectors.counting()));


        Integer i[]={23,5,6,67,678,67,53,45};
        List<Integer> ik=Arrays.asList(i);
        //Integer   ka=ik.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        ik.stream().sorted().forEach(x->{System.out.println(x);});
        //System.out.println(ka);



        /*Map<String, Integer> map =
                liststring.stream().collect(Collectors.toMap(Function.identity(), String::length));

        map.entrySet().stream().forEach(x->{System.out.println(x.getKey()+":::"+x.getValue());});*/








      /*  List<String> list1=new ArrayList<>();
        list1.add("hello");
        list1.add("jaka");
        list1.add("iuuiuihh");
        list1.add("kala");
         Map<String,String> dddd=
        list1.stream().collect(Collectors.toMap(String::valueOf, String::toLowerCase));


        //Map<String,Long> kkk=
        liststring.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet().stream().forEach(x->{System.out.println(x.getKey()+"::"+x.getValue());});
*/





    }
}
