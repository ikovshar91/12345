package com.company;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private static class Kekes {
        private String g = "MDA";

        @Override
        public String toString() {
            return g;
        }
    }
    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
        public static void main (String[]args) {
            Sequence sequence = new Sequence(11);
            Kekes kekes = new Kekes();
            for (int i = 0; i < 10; i++) {
                sequence.add(Integer.toString(i));
            }
            sequence.add(kekes);
            Selector selector = sequence.selector();
            while (!selector.end()) {
                System.out.print(selector.current() + " ");
                selector.next();
            }
        }
}
