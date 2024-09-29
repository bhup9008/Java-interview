package com.java.trangile.programe;

import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {
        int a[]={23,34,24,72,12,1,2,6,78,98,12,2,6,78};




                    int temp=0;
                    for(int i=0;i<a.length;i++){
                        for(int j=i+1;j<a.length;j++){
                            if(a[i]>a[j]){
                                temp =a[i];
                                a[i]=a[j];
                                a[j]=temp;
                            }



                        }
                        System.out.println(a[i]);
                    }





        /*Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        /*int temp=0;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
*/

    }
    public static int[] getreverse(int x[]) {
        int l = x.length;
        for (int i = 0; i < l - 1; i++) {
            int temp = 0;
            if (x[i] > x[i++]) {
                temp = x[i];
                x[i] = x[i + 1];
                x[i + 1] = temp;
                //i=-1;
                i=-1;

            }
            // System.out.println(x[i]);


        }
        return x;
    }

}
