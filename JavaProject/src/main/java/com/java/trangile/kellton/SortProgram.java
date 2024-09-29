package com.java.trangile.kellton;

import com.java.trangile.functionalinter.I;

import java.util.*;
import java.util.stream.Collectors;

public class SortProgram {
    public static void main(String[] args) {
        System.out.println("SortProgram");
        String s1 = "bhupendraaapp", rev = "";
        Map<Character, Long> mapStr = s1.chars().mapToObj(c -> (char) (c))
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()));
        System.out.println(mapStr);

        int l = s1.length();

        for (int i = l - 1; i >= 0; i--) {
            char c = s1.charAt(i);
            rev = rev + c;
        }
        System.out.println(rev);

        int[] a = {29, 47, 55, 25, 3, 56, 3, 56, 3, 3, 2, 6};
        int le = a.length;
        int temp = 0;
        /*for(int i=0;i<le;i++){
            for(int j=i+1;j<le;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            //System.out.println(a[i]);
        }*/

        System.out.println("remove deplicate element");
        //int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8,8,3,3, 3};
        int[] array = new int[]{2, 4, 7, 2, 11, 5, 7, 14, 2, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12};
        for (int i = 0; i < array.length; i++) { // outer loop
            for (int j = i + 1; j < array.length; j++) { // inner loop
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element found: " + array[i]);
                }
            }
        }
       /* Map<Integer ,Integer> nameAndCount=new HashMap<>();

        for (Integer name : arr) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set<Map.Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("duplicate element '%s' and count '%d' :", entry.getKey(), entry.getValue());
            }
        }*/

        String s2 = "helloword";
        List<String> stringList = Arrays.asList(s2.split("")).stream().collect(Collectors.toList());
        System.out.println(stringList);
        Map<String, Long> fff = stringList.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(fff);



    }
}
