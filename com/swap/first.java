package com.reshnu.com.swap;
import java.util.Scanner;

public class first {

    //swap two numbers using a temp variable

    public static void main(String [] args){

        Scanner d =new Scanner(System.in);
        Integer num1=d.nextInt();
        Integer num2=d.nextInt();
         Integer temp;
         System.out.println("before Swap num is"+num1+"and num2 is"+num2);

         temp=num1;
         num1=num2;
         num2=temp;
         System.out.println("After Swaping num 1 is"+num1+"and num2 is "+num2);
    }
}
