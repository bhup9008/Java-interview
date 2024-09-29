package com.java.trangile.programe;

public class RemoveDuplicationInt {

    public void duplicate(int a[],int l){
        int temp[]=new int[l];
        int j=0;
        for (int i=0;i<l-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        //temp[j++]=a[l+1];
        int tempSize=temp.length;
        System.out.println(tempSize);
        for(int k=0;k<j;k++){
            System.out.println(temp[k]);
        }

    }
    public static void main(String[] args) {
        int a[]={23,3,4,4,4,2,3,56,5,5,6};
        int l=a.length;
        RemoveDuplicationInt r=new RemoveDuplicationInt();
        r.duplicate(a,l);
    }
}
