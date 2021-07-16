package com.company;

import java.util.LinkedList;

import static com.company.Book.print;

class Stack <T>{
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v){
        storage.addFirst(v);
    }
    public T peek(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
}
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String a = "1,2,3,4,5";
        for(String b : a.split(",")) stack.push(b);
        while (!stack.empty()) print(stack.pop()+ ",");
    }
}
