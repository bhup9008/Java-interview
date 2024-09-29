package com.java.trangile.program;

import java.util.Arrays;

public class Anagram2 {

    public static void main(String[] args) {

        boolean  b1=isAnagram("cat","aot");
        System.out.println(b1);

    }

    public static boolean isAnagram(String s1,String s2){

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();

        int n1=ch1.length;
        int n2=ch2.length;

        if(n1!=n2)
            return false;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i=0;i<n1;i++)
            if(ch1[i]!=ch2[i])
                return false;

        return true;
    }
}
