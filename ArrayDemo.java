package com.reshnu;

public class ArrayDemo{

    public static void main(String[] args){

        int [] a=new  int[5];


        for (int i=0;i<5;i++){
            a[i]=i*2;
        }
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
