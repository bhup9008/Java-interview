package com.java.trangile.kellton.java8;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String lastname;

    private Double salary;
    private List<Address> addresses;

    public Customer(int id, String name, String lastname, Double salary,List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary=salary;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
