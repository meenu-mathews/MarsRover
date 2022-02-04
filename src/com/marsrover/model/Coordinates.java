package com.marsrover.model;

import java.util.Scanner;

public class Coordinates {

    int xCoord;
    int yCoord;

    public void fetchCoordinates(String item) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter coordinates of " +item);
        xCoord = scannerObj.nextInt();
        yCoord = scannerObj.nextInt();
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
}
