package com.reshnu.com.greatestAmong10Numbers;
import java.util.Scanner;

public class GreatestAmong10Numbers {
    int [] a=new int[10];

    void readNumbers(){
       for(int i=0;i<10;i++){

           Scanner d=new Scanner(System.in);
           a[i]=d.nextInt();

       }

    }

    int findGreatestNumber(){
        int greaterNumber=a[0];
        for (int i=0;i<10;i++){

                if(a[i]>greaterNumber){

                    greaterNumber=a[i];



                }

        }
        return  greaterNumber;
    }
    public static void main(String [] args){
        GreatestAmong10Numbers obj=new GreatestAmong10Numbers();
        obj.readNumbers();
        int num=obj.findGreatestNumber();
        System.out.print(num);
    }

}
