package com.reshnu.com.decimalToBinary;
import java.util.Scanner;

public class DecimalToBinary {

    void deciToBinary(int num){
        int bin=0;
        while(num!=0){
            int rem=num%2;
             bin=bin*10+rem;
            num=num/2;
        }
        String value=String.valueOf(bin);
        StringBuilder input=new StringBuilder();
        input.append(value);
        input=input.reverse();
        System.out.print(input);

    }

    void binaryToDecimal(int num){
       double dec=0;
       int p=0;

    while(num!=0){
        int temp=num%10;
        dec=dec+temp*Math.pow(2,p);
        num=num/10;
        p++;
    }
System.out.println(dec);

    }

    public static void main(String[] args){

        DecimalToBinary obj =new DecimalToBinary();
        Scanner d=new Scanner(System.in);
        //int num=d.nextInt();
       //obj.deciToBinary(num);
        obj.binaryToDecimal(1001111);
    }

}
