package com.reshnu.com.palindrome;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner d =new Scanner(System.in);
        int num=d.nextInt();
        int rev=0;
        int temp=num;

        for(;num!=0;){

            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp){
            System.out.print("given number is palindrome");
        }
        else{
            System.out.print("given number not a palindrome");
        }

    }

}
