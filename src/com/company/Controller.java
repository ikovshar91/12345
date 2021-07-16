package com.company;


import java.util.*;


abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() { // С возможностью перезапуска
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}

public class Controller {
    // Класс из пакета java.util для хранения объектов Event:
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        ListIterator<Event> listIterator = new LinkedList<>(eventList).listIterator();
        while (listIterator.hasNext()) {
            Event h = listIterator.next();
            System.out.println(h);
            h.action();
            eventList.remove(h);
        }
    }

//        while (eventList.size() > 0)
//// Создать копию, чтобы избежать модификации списка // во время выборки элементов:
//            for (Event e : new LinkedList<>(eventList))
//                if (e.ready()) {
//                    System.out.println(e);
//                    e.action();
//                    eventList.remove(e);
//                }

}