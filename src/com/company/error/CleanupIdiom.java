package com.company.error;


class NeedsCleanup{
    private static long counter = 1;
    private final long id = counter++;
    public void disponce(){
        System.out.println("NeedsCleanup " + id + " освобожден");
    }
}
class ConstructorException extends Exception{}

class NeedsCleanup2 extends NeedsCleanup{
    public NeedsCleanup2() throws ConstructorException{};
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
        } finally {
            nc1.disponce();
        }
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
        } finally {
            nc3.disponce();
            nc2.disponce();
        }
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {

                } finally {
                    nc5.disponce();
                }
            } catch (ConstructorException e){
                System.out.println(e);
            } finally {
                nc4.disponce();
            }
        } catch (ConstructorException e){
            System.out.println(e);
        }

    }
}
