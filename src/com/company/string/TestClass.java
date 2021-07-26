package com.company.string;

public class TestClass {
    int b = 5;
    long a = 1521166716;
    float q = 25.52f;
    double y = 52.6;

    @Override
    public String toString() {
        return String.format("int: %d \n" +
                "long: %d \n" +
                "float: %f \n" +
                "double: %f",b,a,q,y);
    }

    public static void main(String[] args) {

        System.out.println(new TestClass());
    }
}
