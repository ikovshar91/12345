package com.company;

import java.util.LinkedList;

public class PrintingContainers {

    public static void main(String[] args) {

        LinkedList<String> pets = new LinkedList<>();
        pets.add("КИТ");
        pets.add("ПЭС");
        pets.add("ЖЫЖ");
        pets.add("ХЭх");

        System.out.println(pets);

        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): "+ pets.element());

        System.out.println("pets.peek(): "+pets.peek());

        System.out.println("pets.remove(): "+ pets.remove());
        System.out.println("pets.getFirst(): "+pets.getFirst());
        System.out.println("pets.poll(): "+pets.poll());

        System.out.println(pets);

        pets.addFirst("КРЫСО");
        System.out.println("После эдферст: "+ pets);

        pets.offer("РАНДОМ ХУЯРЮ");
        System.out.println("После оффер: "+ pets);
        pets.addLast("АГА");
        System.out.println(pets);
    }
}