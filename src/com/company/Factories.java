package com.company;

import java.util.Random;

import static com.company.Book.print;

interface Brosok{
    boolean move();
}
interface BrosokFactory{
    Brosok getmove();
}

class BrosokMoney implements Brosok{
    private BrosokMoney(){}
    private int kolvo = 1;
    private static final int KOLVO = 5;

    @Override
    public boolean move() {
        Random random = new Random();

        System.out.print("Бросок №" + kolvo);
        if (random.nextBoolean() == true) {
            print("-> Орел");
        } else {
            print("-> Решка");
        }
        return ++kolvo != KOLVO;
    }
    public static BrosokFactory factory = new BrosokFactory(){
        public Brosok getmove(){return  new BrosokMoney();}
    };
}

class BrosokKubik implements Brosok{
    private BrosokKubik(){}
    private int kolvo = 1;
    private static final int KOLVO = 20;
    private static final int GRANI = 6;

    @Override
    public boolean move() {
        Random random = new Random();
        int b = random.nextInt(6);
        if (b == 0){ kolvo--; move();} else {
        print("Бросок №"+ kolvo + " = "+ b);}
        return ++kolvo != KOLVO;
    }
   public static BrosokFactory factory = new BrosokFactory() {
        @Override
        public Brosok getmove() { return new BrosokKubik();}
    };
}

public class Factories {
    public static void playBrosok(BrosokFactory brosok){
        Brosok s = brosok.getmove();
        while (s.move());
    }

    public static void main(String[] args) {
        playBrosok(BrosokMoney.factory);
        playBrosok(BrosokKubik.factory);
    }
}