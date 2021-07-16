package com.company;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ProvetrOn(1000),
                gc.new ProvetrOff(1200),
                gc.new ThermostatDay(1600),
        };
        gc.addEvent(gc.new Restart(2400, eventList));
        gc.addEvent(gc.new Terminate(8000, eventList));

        gc.run();
    }
    }

