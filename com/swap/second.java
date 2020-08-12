package com.reshnu.com.swap;
import java.util.Scanner;

public class second {
    //Swap two numbers without temp variable
    public static void main(String [] args){
        Scanner d=new Scanner(System.in);
        int num1=d.nextInt();
        int num2=d.nextInt();
        System.out.println("before Swaping"+num1+"and"+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swaping"+num1+"and"+num2);
    }
}
