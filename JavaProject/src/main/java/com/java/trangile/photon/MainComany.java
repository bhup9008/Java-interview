package com.java.trangile.photon;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainComany {

    public static void main(String[] args) {
     /*   Customer c1=new Customer(1L,"abishek","kumar");
        Customer c2=new Customer(2L,"abishek","kumar");
        Customer c3=new Customer(3L,"abishek","kumar");
        Customer c4=new Customer(4L,"abishek","kumar");
        Customer c5=new Customer(5L,"abishek","kumar");

        List<Customer> customerList=new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);

        Company com1=new Company("Trangile","biopharma","IN",customerList);
        Company com2=new Company("Photon","healthcare","IN",customerList);
        Company com3=new Company("NIIT","biopharma","IN",customerList);
        Company com4=new Company("PA","education","IN",customerList);
        Company com5=new Company("TCS","education","IN",customerList);

        List<Company> companyList=new ArrayList<>();
        companyList.add(com1);companyList.add(com2);
        companyList.add(com3);companyList.add(com4);companyList.add(com5);

        //companyList.stream().sorted()
        companyList.sort(Comparator.comparing(Company::getDepartment));
        System.out.println(companyList);*/

        String str="Avantor, a Fortune 500 company, is a leading global provider of mission-critical " +
                "products and services to customers in the biopharma, healthcare, education & government," +
                " and advanced technologies & applied materials industries. Our portfolio is used in " +
                "virtually every stage of the most important research, development and production activities " +
                "in the industries we serve. Our global footprint enables us to serve more than 300,000 customer" +
                " locations " +
                "and gives us extensive access to research laboratories " +
                "and scientists in more than 180 countries. We set science in motion to create a better world.";


        String []str1=str.split(" ");

        Map<String ,Long> countword=
        Arrays.asList(str1).stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        countword.entrySet().stream().forEach(x->System.out.println(x.getValue()+":"+x.getKey()));

        List<String> list=new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("AA");
        list.add("CC");
        list.add("BB");

       /* Map<String ,String> fff=
        list.stream()
                .collect(Collectors.toMap(String::valueOf, Function.identity()));
*/

       Map<String, Integer> map =  list.stream().distinct().collect(Collectors.toMap(Function.identity(), String::length));

        Map<String, Integer> map1 = Stream.of("bla", "blabla", "blablabla","bla").distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));




        System.out.println(map1);
        System.out.println(map);



    }

   /* public static Integer getvalue(String str){
        Map<Character,Long> kkkk=
        str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        return 5;
    }*/











}
