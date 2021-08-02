package com.company.string;

import java.io.StringReader;
import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println(
                "How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        String[] x = stdin.nextLine().split(" ");
        int age = Integer.parseInt(x[0]);
        Double favorite = Double.parseDouble(x[1]);
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("My favorite double is %f.\n", favorite / 2);

    }

}
