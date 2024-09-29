package test.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerMail {
    public static void main(String[] args) {
        List<Customer> list=new ArrayList<>();
        Customer c1=new Customer(10,"bhupendra","kumar","HR",5000.0);
        Customer c2=new Customer(2,"anil","sharma","HR",500.0);
        Customer c3=new Customer(5,"anil","verma","CS",3000.0);
        Customer c4=new Customer(4,"hivak","kohi","IT",7000.0);
        Customer c5=new Customer(7,"komat","yadav","IT",6000.0);
        list.add(c1);  list.add(c2);  list.add(c3);  list.add(c4);list.add(c5);

        //list.stream().sorted().forEach(x->{System.out.println(x.getId());});

        list.stream().map(x->x.getSalary()).sorted(Comparator.comparing(Double::longValue).reversed()).forEach(x->{System.out.println(x);});



    }
}

