package com.marsrover.app;
import com.marsrover.MarsRoverTest;
import com.marsrover.model.MarsRover;
import com.marsrover.model.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Plateau plateauObj = new Plateau("grid");
        plateauObj.makePlateau();
        MarsRover marsRoverObj = new MarsRover("rover");
        marsRoverObj.getRoverDetails();
        marsRoverObj.moveRover();
    }
}


