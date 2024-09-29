package com.java.trangile.TheadTest;

public class Thread1Main {
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,7,8};
        Thread1 m=new Thread1(a);
        m.start();
    }
}

