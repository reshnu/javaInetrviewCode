package com.reshnu;


public class MultiDimensionalArrayDemo {

    public static void main(String [] args){
        int [][]a=new int[3][3];

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=i;

            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(a[i][j]);

            }
        }

    }
}
