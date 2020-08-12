package com.reshnu;

public class ParameterizedConstructorDemo {

    int instanceVariable;
    ParameterizedConstructorDemo(int var){
        instanceVariable=var;
    }
    public static void main(String [] args){

        ParameterizedConstructorDemo obj=new ParameterizedConstructorDemo(20);
        ParameterizedConstructorDemo obj1=new ParameterizedConstructorDemo(70);
        System.out.println(obj.instanceVariable);
        System.out.println(obj1.instanceVariable);
    }
}
