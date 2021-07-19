package com.company;

public class Solution {

 public static void sync(Object obj , int b) {

     while (true) {
         synchronized (obj){
             System.out.println(b);
             obj.notify();
             try {
                 obj.wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        }
 }

    public static void main(String[] args) throws InterruptedException {
     Object obj = new Object();
     Thread thread1 = new Thread(() -> { sync(obj, 1);});

        Thread thread2 = new Thread(() -> { sync(obj, 2);});

        thread1.start();
        thread2.start();

    }
}



