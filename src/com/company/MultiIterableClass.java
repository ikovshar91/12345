package com.company;

import java.util.*;


public class MultiIterableClass extends IterableClass{
    protected String[] words = ("And that is how " +
"we know the Earth to be banana-shaped.").split(" ");

    public Iterable<String> reversed(){
        return () -> new Iterator<>() {
            int current = words.length -1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public String next() {
                return words[current--];
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shiffled =
                        new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shiffled, new Random(47));
            return shiffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();

        for (String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic.words)
            System.out.print(s + " ");

    }
}
