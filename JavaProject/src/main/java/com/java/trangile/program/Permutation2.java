package com.java.trangile.program;

public class Permutation2 {
    public static void main(String[] args) {
        String s="abc";
        permit(0,s);

    }

    public static String swap(String str,int a,int b){
        char ch[]=str.toCharArray();
        char p=ch[a];
        ch[a]=ch[b];
        ch[b]=p;
        return String.valueOf(ch);
    }

    public static void permit(int index,String s){
        if(index==s.length()-1){
            System.out.println(s);
            return;
        }
        for (int i=0;i<s.length();i++){
            s=swap(s,i,index);
            permit(index+1,s);
           // s=swap(s,i,index);
        }
    }
}
