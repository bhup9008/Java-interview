package com.java.trangile.photon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tsy {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(167);
        list.add(109);
        list.add(145);

        /*Integer x=list.stream().sorted().skip(1).findFirst().get();
        System.out.println(x);*/

        int y[]={12,34,56,67,89,23};
        int l=y.length;


        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int temp=0;
                if(y[i]<y[j]){
                    temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }


            }

        }
        System.out.println(y[1]);




    }
}
