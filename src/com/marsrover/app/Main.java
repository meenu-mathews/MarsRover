package com.marsrover.app;
import com.marsrover.MarsRoverTest;
import com.marsrover.model.MarsRover;
import com.marsrover.model.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        marsRoverTestObj.checkOutput();
//        MarsRoverTest marsRoverTestObj = new MarsRoverTest();


        Plateau plateauObj = new Plateau();
        plateauObj.makePlateau();
        MarsRover marsRoverObj = new MarsRover();
        marsRoverObj.getRoverDetails();
    }
}


