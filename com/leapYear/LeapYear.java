package com.reshnu.com.leapYear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String [] args){

        Scanner d =new Scanner(System.in);
        int year=d.nextInt();

        if(year%4==0){
            if (year%100==0){
                if (year%400==0){

                    System.out.print("Given Number is LeapYear");
                }
                else{

                    System.out.print("given number  a palidrome");
                }
                System.out.print("given number is not a palindrome");

            }

        }

    }

}
