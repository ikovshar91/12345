package com.company.error;

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        }catch (Sneeze s){
            System.out.println("Перехвачено Sneeze");
        }catch (Annoyance a){
            System.out.println("Перехвачено Annoyance");
        }
        try {
            throw new Sneeze();
        } catch (Annoyance a){
            System.out.println("Перехвачено Annoyance");
        }

    }

}
