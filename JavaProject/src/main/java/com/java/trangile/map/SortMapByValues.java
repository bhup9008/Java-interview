package com.java.trangile.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {
        String str = "aaabbccddddee";

        Map.Entry<Character, Long> map =
                str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(map.getKey() + ":====" + map.getValue());
        // Comparator<Long> longComparator=C
        Map<Character, Long> map3 =
                str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                        .entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        map3.entrySet().stream().findFirst().get();
        System.out.println(map3.entrySet().stream().findFirst().get());

        Map<Character, Long> map2 =
                str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        map2.forEach((x,y)->System.out.println(x+":"+y));
        Map<Character, Long> hm1 = sortByValue(map2);
        for (Map.Entry<Character, Long> en :
                hm1.entrySet()) {
            System.out.println("Key = " + en.getKey()
                    + ", Value = "
                    + en.getValue());
        }

        //  System.out.println(map2.getKey() + ":" + map2.getValue());

       /* String s="jAvA Is objECT ORienteD PROgrammiNG languAGE.";


        String[] list=s.split(" ");
        List<String> tt= Arrays.asList(list);

        tt.stream().forEach(result->{
           // StringBuilder result2 = new StringBuilder("nnnn");
           // System.out.println(result);
            StringBuilder sb=new StringBuilder(result);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            //String result2=sb.toString();
            System.out.print(sb+" ");

        });*/


        // List<Integer> list1= Arrays.asList(23,89,43,2,4,56,12);
        //list1.stream().sorted(Comparator.reverseOrder()).forEach(x->{System.out.println(x);});

    }

    public static Map<Character, Long> sortByValue(Map<Character, Long> hm)
    {
        HashMap<Character, Long> temp
                = hm.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        return temp;
    }

}
