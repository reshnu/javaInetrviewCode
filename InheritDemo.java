package com.reshnu;

class Employee{
    int salary=1000;

}

class Employe1 extends Employee{
    String name="Reshnu Chandran";
    String position="It Professional";

}

public class InheritDemo {

    public static void main(String [] args){

        Employe1 obj=new Employe1();
        System.out.println(obj.salary);
        System.out.println(obj.name);
    }

}
