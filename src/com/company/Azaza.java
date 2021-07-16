package com.company;



interface LOL{
    void da();
    void net();
}
interface all{
    void kek();
    void kekall();
}
interface mda extends LOL, all{
    void mda();
}
abstract class Anna{
    Igor igor;
    public String name(){ return getClass().getSimpleName();}

    void merry(){
        System.out.println("Женись лалка " + name());
    }
}

class Vasya extends Anna{

}

class Igor extends Anna  implements mda{
    @Override
    public void da() {

    }

    @Override
    public void net() {

    }

    @Override
    public void kek() {

    }

    @Override
    public void kekall() {

    }

    @Override
    public void mda() {

    }
}

public class Azaza {
    public static void main(String[] args) {
        Igor igor = new Igor();
        Vasya vasya = new Vasya();
        igor.da();
        igor.kek();
        igor.mda();
        igor.net();
        vasya.merry();
        igor.merry();
    }
}
