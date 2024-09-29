package com.java.trangile.imutable;

import java.util.*;

public final class FinalClassExampleTest {

    // fields of the FinalClassExample class
    private final int id;

    private final String name;

    private final List<Address> testMap;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter function for mutable objects

    public List<Address> getTestMap(){
        List<Address> finalList = new ArrayList<Address>();
        testMap.forEach(s -> finalList.add(s));
        return finalList;

    }

    /*public HashMap<String, String> getTestMap() {
        return testMap;
    }*/
    // Constructor method performing deep copy

    public FinalClassExampleTest(int i, String n, List<Address> hm){
        System.out.println("Performing Deep Copy for Object initialization");

        // "this" keyword refers to the current object
        this.id=i;
        this.name=n;

        /*HashMap<String,String> tempMap=new HashMap<String,String>();
        String key;
        Iterator<String> it = hm.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            tempMap.put(key, hm.get(key));
        }*/
        //List<Address> immuList = Collections.unmodifiableList(noElementList);
        List<Address> list=new ArrayList<>();
        //Address address;
        Iterator<Address> it = hm.iterator();
        while(it.hasNext()){
           list.add(it.next());
        }
        this.testMap=list;
    }

    // Test the immutable class

    public static void main(String[] args) throws Exception{
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i=10;


        List<Address> list=new ArrayList<>();
        Address a=new Address(1,"bhup");
        list.add(a);
        Address a1=new Address(2,"kama");
        FinalClassExampleTest ce = new FinalClassExampleTest(i,s,list);
        //list.add(a1);
        ce.getTestMap().add(a1);


        // print the ce values
        System.out.println("ce id: "+ce.getId());
        System.out.println("ce name: "+ce.getName());
        System.out.println("ce testMap: "+ce.getTestMap());
        // change the local variable values


    }

}