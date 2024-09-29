package com.java.trangile;

public class AThead extends Thread{
    @Override
    public void run() {
        System.out.println("run method in Athead class in");


    }

    public static void main(String[] args) {
        AThead t1=new AThead();
        AThead t2=new AThead();
        t1.start();
        t2.start();

    }
}
