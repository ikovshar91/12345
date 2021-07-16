package com.company;

public class Book{
    public static int[] range (int b){
        int [] a = new int[b];
        for (int i = 0; i < b; i++){
            a[i]=i;
        }
        return a;
    }

    public static void print(int x){
        System.out.print(x);
    }
    public static void print(String s){
        System.out.print(s);
    }
    public static void print(){
        System.out.println();
    }

}
