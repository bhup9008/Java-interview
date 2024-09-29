package com.java.trangile;

import java.util.Map;
import java.util.stream.Collectors;

public class UniChar {
    public static void main(String[] args) {
        String str="Java is jelly good";
        String newstr="";
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);

        //String str1=str.trim();
        String s[]=str.split(" ");
        for (int i=0;i<s.length;i++)
        {
            newstr=newstr+s[i];
        }


        System.out.println(newstr);

        Map<Character,Long> ddd=
                newstr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        ddd.entrySet().stream().filter(c->c.getValue()>1).forEach(y->{System.out.println(y.getKey()+":"+y.getValue());});

    }
}
