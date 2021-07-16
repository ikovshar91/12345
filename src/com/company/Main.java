package com.company;

import java.util.Arrays;


abstract class StringProcessor implements Processor{
    public String name(){
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s = "If she weigth шотатам блять";

    public static void main(String[] args) {
       Main.process(new Upcase(), s);
       Main.process(new Downcase(), s);
       Main.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input) { return ((String) input).toUpperCase();}
}

class Downcase extends StringProcessor {
    public String process(Object input) { return ((String) input).toLowerCase();}
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
    public class Main {
        public static void process(Processor p, Object s) {
            System.out.println("Используем опертор "+p.name());
            System.out.println(p.process(s));
        }
    }
