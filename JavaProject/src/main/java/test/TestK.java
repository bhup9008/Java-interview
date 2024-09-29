package test;


import com.java.trangile.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestK{
public static void main(String[] args) {

    Employee e1=new Employee(1L,"bhu",12,123.0);
    Employee e2=new Employee(2L,"piyush",34,35666.0);
    Employee e3=new Employee(3L,"kalna",56,123.0);
    Employee e4=new Employee(4L,"lka",12,1000.0);
    Employee e5=new Employee(5L,"kbfy",34,2000.0);
    Employee e6=new Employee(6L,"fklf",76,1456.0);

    List<Employee> list=new ArrayList<>();
    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    list.add(e5);
    list.add(e6);
    Map<Integer,List<Employee>> map=
    list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toList()));
    System.out.println(map);
    map.entrySet().stream().forEach(x->{
        List<Employee> list1=x.getValue();
        list1.stream().forEach(c->{System.out.println(x.getKey()+":"+c.getName());});

    });
    //List<Employee> sortEmAge=
   // list.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName)).forEach(x->System.out.println(x.getName()+":"+x.getAge()+":"+x.getId()));
   // sortEmAge.forEach(x->System.out.println(x.getName()+":"+x.getAge()+":"+x.getId()));

    String s="register bhupenr jaakk kakka",rev="";
    String []spli=s.split(" ");
    Stream.of(spli).distinct().skip(1).collect(Collectors.toList());









}
}
