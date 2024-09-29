package com.java.trangile.programe;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharctor {
    public static void main(String[] args) {
        String s="bhupendrahaudd";

     s.chars().mapToObj(x->(char)(x))

       .collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(u->u.getValue()>1).
             forEach(o->System.out.println(o.getValue()+":"+o.getKey()));
        List<Character> kk=s.chars().mapToObj(x->(char)(x)).collect(Collectors.toList())
                .stream().distinct().collect(Collectors.toList());

      System.out.println(kk);
        char ch[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);

            }else {
                map.put(ch[i],1);
            }
        }
        System.out.println(map);



        //count vowals

        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='u'){
                System.out.println(s.charAt(i));
            }
        }

        String s1="peek", rev="";

        int l=s1.length();
        for (int i=l-1;i>=0;i--){
            char ch2=s1.charAt(i);

            rev=rev+ch2;
        }
        System.out.println(rev);

    }
}
