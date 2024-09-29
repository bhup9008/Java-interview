package com.java.trangile;

public class ABBB extends A{
    public ABBB() {
        super(23);
    }

    public static void main(String[] args) {

        ABBB c=new ABBB();
        c.m1(9);




    }

    @Override
    public void m1(int v) {
        System.out.println("xfdf"+v);
    }
}
