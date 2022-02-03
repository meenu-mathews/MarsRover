package com.marsrover.app;
import com.marsrover.MarsRoverTest;
import com.marsrover.model.MarsRover;
import com.marsrover.model.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        MarsRoverTest marsRoverTestObj = new MarsRoverTest();
//        marsRoverTestObj.checkOutput();

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter max coordinates of plateau");
        int xCoord = scannerObj.nextInt();
        int yCoord = scannerObj.nextInt();
        Plateau plateauObj = new Plateau();
        plateauObj.makePlateau(xCoord,yCoord);
    }
}


