package com.company;


import java.util.ArrayList;

import static com.company.Book.print;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}

class Orange{}


public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList <Apple> apples = new ArrayList();
        for (int i = 0; i < 3 ; i++) apples.add(new Apple());
        for (int i = 0; i < apples.size(); i ++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple c : apples){
            System.out.println(c.id());
        }
    }
}
