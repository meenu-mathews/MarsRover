package com.marsrover.model;

import java.util.Locale;
import java.util.Scanner;

public class Plateau extends Coordinates{

    public Plateau(String item) {
        super(item);
    }

    public void makePlateau() {
        String[][] grid = new String[xCoord][yCoord];
        System.out.println("[" + xCoord + "][" + yCoord + "] grid created");
    }

}
