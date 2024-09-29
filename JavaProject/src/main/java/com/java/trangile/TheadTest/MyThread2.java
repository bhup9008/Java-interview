package com.java.trangile.TheadTest;

public class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        System.out.println("MyThread2   classes  ===========");
        t.printTable(100);
    }
}
