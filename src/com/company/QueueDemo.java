package com.company;

import java.util.*;

public class QueueDemo {

    public static void printQ(Queue queue){
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
                System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        String s = "Brontosarus";
        for (char c : s.toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for(int i = 0; i < 10; i++)
            priorityQueue.offer(random.nextInt(i+10));
        QueueDemo.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25,22,20,
                18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(
                ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);


        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ =
                new PriorityQueue<>(strings);
        QueueDemo.printQ(stringsPQ);
        stringsPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQ(stringsPQ);

        Set<Character> charSet = new HashSet<>();
        for(char c : fact.toCharArray()) charSet.add(c); // Autoboxing
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);


    }
}
