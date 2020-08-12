package com.reshnu;

public class StringDemo {
    public static void main(String[] args){

        String s1="Reshnu";
        String S2="Reshma";
        System.out.println(s1.length());
        System.out.println(s1.compareTo(S2));
        String s3=s1+S2;
        System.out.println(s3);
        System.out.println(s1.isEmpty());
        System.out.println(s1.substring(2));

    }
}
