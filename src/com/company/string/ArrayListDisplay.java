package com.company.string;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for( int i = 1; i <= 5; i++)
            strings.add("number" + i);
        System.out.println(strings);

    }

}
