package com.company.error;

import java.util.logging.*;

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg); }
    }

public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Возбуждаем MyException из f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Возбуждаем MyException из g()");
        throw new MyException("создано из g()");
    }

    public static void main(String[] args) {
    int i = 0;

    while (true)
        try {
            if (i < 10) {
                i++;
                throw new MyException();
            }
            else {
                System.out.println("Заебись");
                break;
            }
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}
