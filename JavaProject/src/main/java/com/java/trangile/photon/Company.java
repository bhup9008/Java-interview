package com.java.trangile.photon;

import java.util.List;

public class Company {

    private String name;
    private String department;
    private String country;
    List<Customer> customerList;

    public Company(String name, String department, String country, List<Customer> customerList) {
        this.name = name;
        this.department = department;
        this.country = country;
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", country='" + country + '\'' +
                ", customerList=" + customerList +
                '}';
    }
}
