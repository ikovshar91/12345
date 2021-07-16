package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) { this.gerbilNumber = gerbilNumber;}

    public void hop() { System.out.println(gerbilNumber + " loh");}

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i));
            gerbils.get(i).hop();
        }
    }
}
