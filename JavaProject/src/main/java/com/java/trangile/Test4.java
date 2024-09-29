package com.java.trangile;

public class Test4 {
    public static void main(String[] args) {
        int a[]={10,12,12,34,34,45,45,56,56,65,78};
        int l=a.length;
       int x= removeduplicate(a,l);
       for (int i=0;i<x;i++){
           System.out.println(a[i]);

       }

    }

    public static int removeduplicate(int []a,int l){
        if(l==0||l==1){
            return l;

        }

        int x[]=new int[l];
        //int temp=0;
        int j=0;
        for(int i=0;i<l-1;i++){
            if(a[i]!=a[i+1]){
                x[j++]=a[i];
            }
        }
        //x[j++] = a[l-1];
        // Changing original array
        for (int i=0; i<j; i++){
            a[i] = x[i];
        }



        return j;
    }
}
