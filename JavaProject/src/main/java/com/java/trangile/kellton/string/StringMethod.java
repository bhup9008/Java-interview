package com.java.trangile.kellton.string;

public class StringMethod {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("change values of string ");

        s2="word";
        System.out.println(s2.hashCode());
        s2=s2+"test";
        System.out.println(s2);
        System.out.println(s2.hashCode());

        System.out.println("String Bulder class operation");
        StringBuilder sb=new StringBuilder("hello");
        StringBuilder sb1=new StringBuilder("hello");
        System.out.println(sb.hashCode());
        System.out.println(sb1.hashCode());
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
        sb=sb.append("rat");
        System.out.println("Change sb values");
        System.out.println(sb);
        System.out.println(sb.hashCode());



    }
}
