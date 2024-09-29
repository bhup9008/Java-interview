package com.java.trangile.TheadTest;

public class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        System.out.println("MyThread1    classes  ===========");
        t.printTable(5);
    }
}
