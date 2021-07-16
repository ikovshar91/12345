package com.company;

 interface Kekes{
    Kekes kek1();
     class Vlozh{
         public static Kekes zz(){
             Kekes kekes = new Kekes() {
                 @Override
                 public Kekes kek1() {
                     System.out.println("azaza");
                     return null;
                 }
             };
             return kekes.kek1();
         }
     }

     static void main(String[] args) {
         new Vlozh().zz();
     }
}
