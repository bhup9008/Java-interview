package com.java.trangile.kellton.java8;

public class Address {
    private int galino;
    private String city;
    private String state;

    public Address(int galino, String city, String state) {
        this.galino = galino;
        this.city = city;
        this.state = state;
    }

    public int getGalino() {
        return galino;
    }

    public void setGalino(int galino) {
        this.galino = galino;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
