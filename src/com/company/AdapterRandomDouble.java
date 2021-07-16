package com.company;
import java.nio.CharBuffer;
import java.util.Scanner;

    public class AdapterRandomDouble extends RandomDoubles implements Readable {
        private int count;
        public AdapterRandomDouble(int count) {
            this.count = count;
        }
        public int read(CharBuffer cb) {
            if (count-- == 0) {
                return -1;
            }
            String result = next() + " ";
            cb.append(result);
            return result.length();
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(new AdapterRandomDouble(7));
            while (s.hasNext())
                System.out.print(s.next() + " ");
        }
    }
