package com.java.trangile.exception;

import java.io.IOException;

public class MainTest extends A{
    @Override
    public void m1() throws RuntimeExceptionA{
        System.out.println("Main test class ");

    }

    public static void main(String[] args)  {

        A test=new MainTest();
       // test.m1();

    }
}
