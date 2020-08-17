package com.reshnu.com.reverseANumber;

import java.util.Scanner;

public class ReverseAFloatNumber {

    String[] splitNumber(float num){
        String st=String.valueOf(num);
        String [] str=st.split("\\.");


        return str;

    }
    void reverseNumber(String[] ans){
        int rev1=0;
        int rev2=0;
        int before=Integer.parseInt(ans[0]);
        int after=Integer.parseInt(ans[1]);

        while (before!=0){
            int rem=before%10;
            rev1=rev1*10+rem;
            before=before/10;


        }
        while (after!=0){

            int rem=after%10;
            rev2=rev2*10+rem;
            after=after/10;
        }
        System.out.println(rev1+"."+rev2);

    }

    public static void main(String [] args){

        Scanner d=new Scanner(System.in);
        float num=d.nextFloat();
        ReverseAFloatNumber obj=new ReverseAFloatNumber();
        String ans[]=obj.splitNumber(num);
        obj.reverseNumber(ans);

    }
}
