package com.company;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Class implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHILKLMN0PQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();
    private int count;

    public Class(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1; // Признак конца входных данных
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Количество присоединенных символов
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new Class(10));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
