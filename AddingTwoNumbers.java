package com.reshnu;

public class AddingTwoNumbers{
    public Integer sum(Integer a,Integer b,Integer c){
        Integer add=a+b+c;
        return add;
    }
    public void sum(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public static void main(String [] args){
        AddingTwoNumbers obj=new AddingTwoNumbers();
       obj.sum(50,20);
       Integer add=obj.sum(10,20,30);
       System.out.println(add);

    }

}