package com.java.trangile.kellton;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgrameTest {
    public static void main(String[] args) {

        List<String> list=Arrays.asList("ashok","saini","manish");
        list.stream().collect(Collectors.toMap(Function.identity(),String::length));



        String str="bhupoppeeeeeendrbbba";
        String rev="";
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);

        Map<Character,Long> longMap=
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c1->c1,Collectors.counting()));
        //longMap.entrySet().stream().forEach(x->{System.out.println(x.getValue()+":"+x.getKey());});
        longMap.entrySet().stream().filter(x->x.getValue()>2).forEach(x->{System.out.println(x.getValue()+":"+x.getKey());});

        int a[]={10,10,20,40,60,60,45,45};
        Arrays.sort(a);

        int lp=a.length;
        int temp=0;

        int x=removeDuplicate(a,lp);
        System.out.println("test program");
        for(int i=0;i<x;i++){
            System.out.println(a[i]);
        }

      /*  for(int i=0;i<lp;i++){
            for(int j=i+1;j<lp;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }*/



    }

    public static int removeDuplicate(int []ar,int l){
        if(l==1||l==0){
            return l;
        }

        int temp[]=new int[l];
        int j=0;
        for (int i=0;i<l-1;i++){
            if(ar[i]!=ar[i+1]){
                temp[j++]=ar[i];
            }
        }

        temp[j++]=ar[l-1];

        for(int i=0;i<j;i++){
            ar[i]=temp[i];
        }
        return j;
    }






}
