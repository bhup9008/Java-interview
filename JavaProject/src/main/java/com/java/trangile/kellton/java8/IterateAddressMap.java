package com.java.trangile.kellton.java8;

import com.java.trangile.programe.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IterateAddressMap {
    public static void main(String[] args) {
        Address a1=new Address(2,"noida","UP");
        Address a2=new Address(3,"Jaipur","Raj");
        Address a3=new Address(4,"kama","Raj");
        Address a4=new Address(6,"noida","UP");
        Address a5=new Address(7,"jodhpur","Raj");

        List<Address> addressList1=new ArrayList<>();
        addressList1.add(a1);
        addressList1.add(a2);
        addressList1.add(a3);

        List<Address> addressList2=new ArrayList<>();
        addressList1.add(a4);
        addressList1.add(a5);
        addressList1.add(a1);


        Customer c1=new Customer(1,"bhupendra","kumar",200.0,addressList1 );
        Customer c2=new Customer(2,"Ashok","Saini",200.0,addressList2 );
        Customer c3=new Customer(3,"Ashok","Saini",600.0,addressList2 );
        Customer c4=new Customer(4,"Vivak","Saini",500.0,addressList2 );
        Customer c5=new Customer(5,"Nikai","Saini",100.0,addressList2 );

        List<Customer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        list.stream().map(c->c.getId()).forEach(s->System.out.println(s));
      // List<Address> addresses=
        list.stream().flatMap(c->c.getAddresses().stream()).collect(Collectors.toList());
      // list.stream().map(c->c.getAddresses().stream()).collect(Collectors.toList());//.forEach(s->System.out.println(s.getCity()));
       //System.out.println(addresses);
       // addresses.stream().forEach(s->{System.out.println(s.getCity()+":"+s.getState()+":"+s.getGalino());});

       // list.stream().map(x->x.getSalary()).collect(Collectors.groupingBy(x->x,Collectors.counting()));

       // list.sort(Comparator.comparing(Customer::getName));

        Map<Double,List<Customer>> gteye=list.stream().collect(Collectors.groupingBy(e->e.getSalary(), Collectors.toList()));
        //System.out.println(gteye);

        list.stream()
                .sorted(Comparator.comparing(Customer::getSalary).reversed()).forEach(x->{System.out.println(x.getName());});


        //System.out.println(list);


    }
}
