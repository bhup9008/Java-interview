package com.java.trangile.functionalinter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>,List<Integer>,List<Integer>> {
    @Override
    public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
        return Stream.of(integers,integers).flatMap(List::stream).
                distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BiFunctionExample biFunctionExample=new BiFunctionExample();
        List<Integer> i1=Stream.of(2,45,34,2,1,45,2,6,7).collect(Collectors.toList());
        List<Integer> i2=Stream.of(23,5,4,6,7,2,5,6).collect(Collectors.toList());
        //biFunctionExample.apply(i1,i2);
        System.out.println("Traditional approched"+biFunctionExample.apply(i1,i2));


        BiFunction<List<Integer>,List<Integer> ,List<Integer>> biFunction2=

            (integers, integers2) ->{
                return Stream.of(integers,integers).flatMap(List::stream).
                        distinct().collect(Collectors.toList());
            };
        System.out.println("Lambda approched"+biFunction2.apply(i1,i2));

        Map<String,Integer> map=new HashMap<>();
        map.put("bhupendra",200);
        map.put("Vivak",300);
        map.put("sunil",100);
        map.put("manoj",400);

        BiFunction<String,Integer,Integer> biFunction=new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return integer+100;
            }
        };
        map.replaceAll(biFunction);
        System.out.println(map);
        BiFunction<String,Integer,Integer> biFunction3=(k, v) ->v+100;

        map.replaceAll(biFunction3);
        System.out.println(map);


        }

        //System.out.println("Traditional approched"+biFunction2.apply(i1,i2));


}
