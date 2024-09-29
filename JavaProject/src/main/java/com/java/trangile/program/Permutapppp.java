package com.java.trangile.program;

public class Permutapppp {
    public static void main(String[] args) {
        int a[]={62,773,34,35,89,2,1,3,7,9,98};
        int l[]=pemutation(a);
       /* for (int i=0;i<l.length;i++){
            System.out.println(l[i]);
        }*/


        //pemutation(a,b,al,bl);




    }

    public static int[] pemutation(int a[]){
        for (int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=-1;

            }
        }
return a;
    }
}
