package com.company.error;

import static com.company.Book.print;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("Мое исключение");
        } catch (Exception e) {
            print("Перехвачено " +
                    "\n");
            print("e.getMessage(): " +
                    "\n"+ e.getMessage());
            print("getLocalizedMessage():" + e.getLocalizedMessage());
            print("toString():" + e);
            print("printStack Trace():");
            e.printStackTrace(System.out);
        }
    }
}
