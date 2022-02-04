package com.marsrover.app;
import com.marsrover.MarsRoverTest;
import com.marsrover.model.MarsRover;
import com.marsrover.model.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Plateau plateauObj = new Plateau();
        plateauObj.makePlateau();
        MarsRover marsRoverObj = new MarsRover();
        marsRoverObj.fetchCoordinates("rover");
        marsRoverObj.getRoverDetails();
        marsRoverObj.moveRover(plateauObj.getxCoord(),plateauObj.getyCoord());
        //Test called
        MarsRoverTest marsRoverTestObj = new MarsRoverTest();

        marsRoverTestObj.checkOutput();
    }
}


