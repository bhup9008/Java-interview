package com.java.trangile.functionalinter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionClassAB implements FunctionA,FunctionB{

    public static void main(String[] args) {
        FunctionClassAB m=new FunctionClassAB();
        m.methodTest();
        List<String> list= Arrays.asList("apple","apple","orange","banana");
        Map<String,Long> map=
        list.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        map.entrySet().stream().sorted(Comparator.comparing(String::valueOf).reversed()).
                forEach(x->{System.out.println(x.getKey()+":"+x.getValue());});

    }

    @Override
    public void methodTest() {
        FunctionA.super.methodTest();
    }
}
