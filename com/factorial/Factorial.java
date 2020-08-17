package com.reshnu.com.factorial;

class Factorial {

    void factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){

            fact=fact*i;
        }
        System.out.println(fact);
    }
}

class MainClass{
    public static void main(String[] args){
        Factorial fact=new Factorial();
        fact.factorial(5);

    }
}
