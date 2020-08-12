package com.reshnu;

public class DefaultConstructorDemo {
    int instanceVariable;
    DefaultConstructorDemo(){
        instanceVariable=200;
    }

    public static void main(String [] args){

        DefaultConstructorDemo obj=new DefaultConstructorDemo();
        DefaultConstructorDemo obj1=new DefaultConstructorDemo();

        System.out.println(obj.instanceVariable);
        System.out.println(obj1.instanceVariable);
    }
}
