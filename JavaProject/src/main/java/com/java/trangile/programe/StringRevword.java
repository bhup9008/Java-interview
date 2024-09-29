package com.java.trangile.programe;

public class StringRevword {
    public static void main(String[] args) {
        String s="registration this is owal";
        int l=s.length();

        String str[]=s.split(" ");
        String revStr="";

        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
            String rev="";
            String word=str[i];
            for(int j=word.length()-1;j>=0;j--){
                //char ch=str[i].charAt(j);
                rev=rev+word.charAt(j);
                // System.out.print(rev+" ");
            }

            revStr=revStr+rev+" ";
        }

        System.out.print(revStr);




    }
}
