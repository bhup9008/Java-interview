package com.java.trangile.TheadTest;

public class Thread1 extends Thread {

    private int[] array;

    public Thread1(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
