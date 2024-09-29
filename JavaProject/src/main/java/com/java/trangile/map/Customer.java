package com.java.trangile.map;

import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private String lastname;

    public Customer(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

   /* @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && name.equals(customer.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
