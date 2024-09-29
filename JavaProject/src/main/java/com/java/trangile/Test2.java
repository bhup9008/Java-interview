package com.java.trangile;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Employee e1=new Employee(101L,"Bhupendra",22,200.0);
        Employee e2=new Employee(102L,"Anil",26,300.0);
        Employee e3=new Employee(103L,"Viyay",54,300.0);
        Employee e4=new Employee(104L,"alok",34,500.0);
        Employee e5=new Employee(105L,"Jp",24,3000.0);

        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);


        list.stream().map(Employee::getName).forEach(e->System.out.println(e));

        //list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        //list.stream().forEach(x->{System.out.println(x.getName()+":"+x.getSalary()+":"+x.getId());});
        //System.out.println(list);
        Map<Double,List<Employee>> map=
        list.stream().collect(Collectors.groupingBy(x->x.getSalary(),Collectors.toList()));
        System.out.println(map);


        List<String> list1=Arrays.asList("bhup","alok","vishnu","kamal");
        Map<Integer,String> map1=
        list1.stream().collect(Collectors.toMap(String::length,String::valueOf,(o1,o2)->o1));
        System.out.println(map1);
        /*Map<Integer,String> map1=
        list1.stream().collect(Collectors.toMap(String::length, Function.identity(),(o1,o2)->o1));
        System.out.println(map1);*/






    }

}
