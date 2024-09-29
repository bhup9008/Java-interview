package com.java.trangile.kellton;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupli {
    public static void main(String[] args) {
        int a[]={23,23,45,12,21,23,45,10,10,10,11};

        Map<Integer,Integer> map=new HashMap<>();

        for(Integer l:a){
            Integer cout=map.get(l);
            if(cout==null){
                map.put(l,1);
            }else {
                map.put(l,++cout);

            }
        }

      //  map.entrySet().stream().filter(x->x.getValue()==1).map(x->x).  ;



        int l=a.length;
        int len=removeData(a,l);
        for(int i=0;i<len;i++){
            System.out.println(a[i]);
        }


    }

    public static int removeData(int a[],int n){

        if(n==0||n==1){
            return n;
        }
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[n-1];
        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        return j;
    }
}
