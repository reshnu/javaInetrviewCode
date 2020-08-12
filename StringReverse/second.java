package com.StringReverse;

public class second {
    public static void main(String [] args){
        String name="Reshnu Chandran G B";
                char [] str=name.toCharArray();
                char [] str1=new char[name.length()];
                int size=name.length();
                for(int i=0;i<str.length;i++){
                    str1[i]=str[size-i-1];
                    System.out.print(str1[i]);
                }

    }
}
