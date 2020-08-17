package com.reshnu.com.fibonacci;
import java.util.Scanner;

public class Fibonacci {


    void fib(){
        Scanner d=new Scanner(System.in);
        int a=0,b=1;
        int c=0;
        System.out.println("Enter the limit");

        int limit=d.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<limit;i++){

            c=a+b;
            a=b;
            b=c;
            System.out.println(+c);
        }


    }
    public static void main(String[] args){
        Fibonacci obj=new Fibonacci();
        obj.fib();

    }
}
