package com.java.trangile.photon;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
    List<String>  list=new ArrayList<>();

    public Producer(List list){
        this.list=list;
    }

    @Override
    public void run() {
        list.add("ab");
        list.add("abc");
        list.add("abf");
        list.add("abr");
        Producer producer=new Producer(list);
    }
}
