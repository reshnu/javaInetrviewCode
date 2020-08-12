package com.reshnu;

import java.awt.*;

public class MethodOverloadingDemo {

    public void area(int length,int breadth){
        float area=length*breadth;
        System.out.println("Area of Rectangle is"+area);
    }

    public  void area(int side){

        float area=side*side;
        System.out.println("Area of Square"+area);
    }
    public  void area(float radius){

        double area=3.14*(radius*radius);
        System.out.println("Area of circle is"+area);

    }
    public static void main(String [] args){

        MethodOverloadingDemo obj =new MethodOverloadingDemo();
        obj.area(10,20);
        obj.area(10);
        obj.area((float) 5.7);
    }
}
