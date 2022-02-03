package com.marsrover.model;

import java.util.Scanner;

public class Coordinates {

    int xCoord;
    int yCoord;

    public Coordinates(String item) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter coordinates of " +item);
        xCoord = scannerObj.nextInt();
        yCoord = scannerObj.nextInt();
    }
}
