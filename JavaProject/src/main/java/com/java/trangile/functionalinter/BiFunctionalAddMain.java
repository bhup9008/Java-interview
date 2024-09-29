package com.java.trangile.functionalinter;

public class BiFunctionalAddMain implements BiFunctionalAdd{
    @Override
    public String apply(String s, String s2) {
        return s+s2;
    }

    public static void main(String[] args) {
        BiFunctionalAddMain main=new BiFunctionalAddMain();
        String s="bhupendra";
        String s2="java";

        String xcvv=main.apply(s,s2);
        System.out.println(xcvv);
    }
}
