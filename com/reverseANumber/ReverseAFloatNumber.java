package com.reshnu.com.reverseANumber;

import java.util.Scanner;

public class first {
     int reverseANumber(int num){
        int rev = 0;

        while (num!=0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner d= new Scanner(System.in);
        int num=d.nextInt();
        first obj=new first();
        int rev=obj.reverseANumber(num);
        System.out.println(rev);

    }
}
