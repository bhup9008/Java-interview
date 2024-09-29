package com.java.trangile.stringt;

import java.util.stream.Collectors;

public class StringH {
    public void foo(String s) {
        System.out.println("String");
    }

    public void foo(StringBuffer sb) {
        System.out.println("StringBuffer");
    }

    public static void main(String[] args) {
        new StringH().foo("dddd");
        //String s1="bhup";
        //String s2="bhupen";

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("uuuuuuuuu  "+s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.equals(s1));

        System.out.println(s1 == s2);

        System.out.println(s1==s2);
       /* String s1="hello";
        System.out.println(s1);
        s1=s1+"trartra";
        System.out.println(s1);
        s1=s1.concat("hjdhfpppppppppp");
        System.out.println(s1);

        StringBuilder sb=new StringBuilder("hello");
        sb.append("gghddhhgd");
        System.out.println(sb);
        sb=new StringBuilder("xchjhc");
        System.out.println(sb);
*/


        /*int l=s1.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            char ch=s1.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        s1.chars().mapToObj(x->((char)x)).collect(Collectors.groupingBy(y->y,Collectors.counting())).
                entrySet().stream().filter(t->t.getValue()==1).
                forEach(x->{System.out.println(x.getValue()+":"+x.getKey());});*/
    }
}
