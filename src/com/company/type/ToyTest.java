package com.company.type;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Huest{}

class Toy {

    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Huest{
    FancyToy(){super(1);}
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.print("Имя класса: " + cc.getName()+
                "является интерфейсом? [" + cc.isInterface() +"] \n");
        System.out.print("Простое имя: " + cc.getSimpleName() +"\n");
        System.out.print("Каноническое имя: " + cc.getCanonicalName() +"\n");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.company.type.FancyToy");

        printInfo(c);
        for (Class type : c.getInterfaces())
            printInfo(type);
        printInfo(c.getSuperclass());


    }

}
