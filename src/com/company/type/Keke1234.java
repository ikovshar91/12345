package com.company.type;


import com.company.Book;

class Shape{
    public void g(){
        System.out.println("g()");
    }
}

class Circle extends Shape{
    public void circle(){
        System.out.println("circle" +
                "()");
    }

}


public class Keke1234 {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.g();
        Circle circle1 = new Circle();
        circle1.circle();

    }
}
