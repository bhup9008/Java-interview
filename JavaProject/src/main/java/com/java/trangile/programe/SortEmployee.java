package com.java.trangile.programe;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"bhup","it",2000.0);
        Employee e2=new Employee(2,"anil","it",400.0);
        Employee e3=new Employee(3,"mahesh","hr",200.0);
        Employee e4=new Employee(4,"murari","hr",2000.0);
        Employee e7=new Employee(5,"kamal","it",400.0);
        Employee e5=new Employee(6,"bhup","cs",8800.0);
        Employee e6=new Employee(7,"deb","cs",9800.0);
        List<Employee> list=new ArrayList<>();
        list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);list.add(e7);

        /*list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Comparator.comparing(Employee::getName)));
        System.out.println("list===============");
        System.out.println(list);*/

        List<Employee> hhh=
        list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

        List<Double> ggg=list.stream().map(Employee::getSalary).
                sorted(Collections.reverseOrder()).collect(Collectors.toList());

        Double ddd=list.stream().map(Employee::getSalary).sorted().skip(1).findFirst().get();

        Stream<Employee> emp1 = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1);
        List<Employee> epmloo23=emp1.collect(Collectors.toList());
        System.out.println("epmloo23===============");
        System.out.println(epmloo23);

        Map.Entry<Double, List<String>> jjjjjj= list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getKey()))
                .collect(Collectors.toList())
                .get(4 - 1);
        //.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))

        System.out.println("jjjjjjpppppppp===============");
        System.out.println(jjjjjj);



        //Map.Entry<Double, List<Employee>> ttyyyt=
        list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,  Collectors.toList()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getKey()))
                .collect(Collectors.toList())
                .get(4 - 1);



        System.out.println("ttyyyt===============");
       // System.out.println(ttyyyt);

        List<Employee> sortedList = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("sortedList===============");





        System.out.println(sortedList);
        Optional<Employee> emp = list.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        System.out.println("emp===============");
        System.out.println(emp);
        System.out.println("second===============");
        System.out.println(ddd);
        ggg.stream().forEach(x->System.out.println(x));
        Map<String,Long> ffff=
        list.stream().map(Employee::getDept).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(ffff);
        //list.stream().sorted()



        String orignalString = "world worppppuyyyttld";

        String output = Arrays.asList(orignalString.split(""))
                .stream()
                .distinct().collect(Collectors.joining());
        System.out.println(output);


        Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);


        /*Map<Object, List<Object>> integerMap111= */
        Map.Entry<String,Integer> finalResult = map2.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getValue())).collect(Collectors.toList()).get(1) ;// minus make it to do in desc order

        System.out.println("integerMap111===============");
        System.out.println(finalResult);


        Map<Integer,List<String>> interimResult =
                map2.entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(entry ->entry.getValue(),
                                Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
                        ));
        Map.Entry<Integer,List<String>> finalResult2=interimResult.entrySet().stream().collect(Collectors.toList()).get(2);
        System.out.println("finalResult2===============");
        System.out.println(finalResult2);

        List<String> list1=new ArrayList<>();
        list1.add("hello");
        list1.add("jaka");
        list1.add("iuuiuihh");
        list1.add("kala");

        list1.stream().collect(Collectors.toMap(String::valueOf, String::toLowerCase));

        String s1="java";
        List<String> fffggg=Arrays.asList(s1.split(""));
        fffggg.stream().distinct().collect(Collectors.joining());
        String output1 = Arrays.asList(s1.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
        System.out.println(output1);
       // List<Character> charat=s1.chars().mapToObj(x->(char)(x)).distinct().collect(Collectors.toList());
        //charat.stream().collect(Collectors.joining());


        Map<String,Integer> map3 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);

        map3.entrySet().stream().collect(Collectors.groupingBy(x->x.getValue(),
                Collectors.mapping(x->x.getKey(),Collectors.toList()))).entrySet().stream().collect(Collectors.toList());



        List<String> stringList=Arrays.asList("Anoop","kaaj","daya","pataa","jc");
        List<String> stringList2=stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(stringList2);

        list.sort(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getDept)));


        int x=23456,temp=0;
        int y=0;

        while(x!=0){
            temp=x%10;

            y=y*10+temp;
            x=x/10;
        }
        System.out.println(y);

        List<Integer> listInt=Arrays.asList(12,45,65,23,45,67,78,12,12,3);
        List<Integer> listIntx =listInt.stream().sorted().collect(Collectors.toList());
        //listInt.sort(listInt);
        System.out.println(listIntx);

        Integer dkdd=listInt.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(dkdd);

       String kopao= Arrays.asList(s1.split("")).stream().distinct().collect(Collectors.joining());
        System.out.println(kopao);

        s1.chars().mapToObj(x1->(char)(x1)).collect(Collectors.groupingBy(c->c,Collectors.counting()));


        int a[]={1,3,56,100,10,10};


        /*for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp1=0;
                *//*if(a[i]>a[j]){
                    temp1=a[i];
                    a[i]=a[j];
                    a[j]=temp1;
                }*//*
                if(a[i] == a[j])
                    System.out.println(a[j]);
            }
           // System.out.println(a[i]);
        }*/

            /*if(a[i]==a[i+1]){
                System.out.println(a[i]);
            }*/


      //  list.stream().collect(Collectors.groupingBy(i->i,Collectors.mapping(Collectors.toList())));

       Map<String,List<Employee>>  hfdr= list.stream()
                .collect(Collectors.groupingBy(t->t.getDept(),  Collectors.toList()));

       System.out.println(hfdr);

       Map<String,List<Employee>> gteye=list.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.toList()));
       System.out.println(gteye);

       String string2="register";
       string2.chars().mapToObj(r->(char)r).
               collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));

        // https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/

        int ap[]={0,1,1,0,0,1,1,0,1};

        int l=ap.length;
        int temp1=0;

        int hrr[]=new int[l];
        //int y=0;

        for (int i=0;i<l-1;i++)
        {
           // System.out.println(ap[i]);
            if(ap[i]>ap[i+1]){
                System.out.println(ap[i]);

            }

        }



        list.sort(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getSalary)));

    }
}
