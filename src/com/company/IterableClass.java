package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


 class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return () -> new Iterator<>() {
            int current = size() - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public T next() {
                return get(current--);
            }
        };
    }
}
   public class IterableClass {
        public static void main(String[] args) {
            ReversibleArrayList<String> ral =
                    new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
            for (String s : ral)
                System.out.print(s + " ");
            System.out.println();

            for (String s : ral.reversed())
                System.out.print(s + " ");
        }
    }

