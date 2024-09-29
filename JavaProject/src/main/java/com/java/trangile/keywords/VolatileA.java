package com.java.trangile.keywords;

public class VolatileA {
    private static volatile int x=10;
    static int y=12;
    private static final int z=123;

    public static void main(String[] args) {
        VolatileA a=new VolatileA();
        y=23;
        x=230;
        //z=3344;
        System.out.println(a.x);
        System.out.println(a.y);
    }
}
