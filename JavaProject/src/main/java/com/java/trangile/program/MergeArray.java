package com.java.trangile.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArray {
    public static void main(String[] args) {
        int x[]={2,4,5,6};
        int z[]={7,6,8,9};
        merse1(x,z);
        int l=x.length;
        int k=z.length;


        Integer a[]=new Integer[]{2,4,5,6};
        Integer b[]=new Integer[]{7,6,8,9};
       /* List<Integer []> kkk=
        Stream.of(a,b).collect(Collectors.toList());*/
        List<Integer> lll=
                Stream.of(a,b).flatMap(y-> Stream.of(y)).collect(Collectors.toList());
        lll.stream().forEach(u->System.out.println(u));



        merse(x,z,l,k);
        /*int a=0;
        while (l>a){
            System.out.println(x[a++]);
           // l++;
        }*/
      /*  int temp[]=new int[l+k];
        for(int i=0;i<l;i++){
            temp[i]=x[i];
        }
        for(int i=0;i<k;i++){
            temp[l+i]=z[i];
        }

        for (int m=0;m<l+k;m++){
            System.out.println(temp[m]);
        }*/



    }

    public static void merse(int x[],int z[],int l,int k)
    {
       int a=0;
       int b=0;
       int c=0;

       int temp[]=new int[l+k];
       while (a<l){
           temp[c++]=x[a++];
       }
        while (b<k){
            temp[c++]=z[b++];
        }

        for (int i=0;i<l+k;i++){
            System.out.println(temp[i]);
        }
    }
    public static void merse1(int x[],int z[]) {

        int c = 0;
System.out.println("merse1    ddddddddddd");
        int temp[] = new int[x.length+ z.length];
        for (int i=0;i<x.length;i++){
            temp[i]=x[i];
            c++;
        }
        for (int j=0;j<z.length;j++){
            temp[c]=z[j];
            c++;

        }
        for (int k=0;k<temp.length;k++) {
            System.out.print(temp[k]+" ");
        }
        System.out.print("end call");
    }
}
