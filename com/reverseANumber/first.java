package com.reshnu.com.reverseANumber;

public class ReverseANumberUsingReccursion {

    void recursion(int num){
        if(num<10){
            System.out.println(num);

        }else{
            System.out.print(num % 10);
            recursion(num/10);
        }

    }
    public static void main(String [] args){
        ReverseANumberUsingReccursion obj=new ReverseANumberUsingReccursion();
        obj.recursion(521);

    }
}
