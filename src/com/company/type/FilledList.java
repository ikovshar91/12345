package com.company.type;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){return Long.toString(id);}
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) throws InstantiationException, IllegalAccessException {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < nElements; i++)
            result.add(type.newInstance());
        return result;
    }

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException {
        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);
        System.out.println(f1.create(15));

    }
}