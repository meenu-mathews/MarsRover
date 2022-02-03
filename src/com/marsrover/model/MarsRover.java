package com.marsrover.model;

import java.util.Locale;
import java.util.Scanner;

public class MarsRover extends Coordinates {

    public void getRoverDetails() {
        System.out.println("Enter rover details and direction (N,S,W,E)");
        Coordinates roverCoordinatesObj = new Coordinates();
        Scanner scannerObj = new Scanner(System.in);
        char directionRover = Character.toUpperCase(scannerObj.next(".").charAt(0));


        System.out.println("Rover at [" + xCoord + "][" + yCoord + "] facing " + directionRover);

        System.out.println("Enter instructions (L,R,M) to move the Rover around the Plateau ");
        String roverMoveInstruction = scannerObj.next();

        for (int i = 0; i < roverMoveInstruction.length(); i++) {

            char instruction = roverMoveInstruction.toUpperCase(Locale.ROOT).charAt(i);
            if (instruction == 'L') {
//                Spins the Rover 90 degrees Left without moving from the current coordinate point
                if (directionRover == 'N') {
                    directionRover = 'W';
                } else if (directionRover == 'S') {
                    directionRover = 'E';
                } else if (directionRover == 'W') {
                    directionRover = 'S';
                } else if (directionRover == 'E') {
                    directionRover = 'N';
                }
            } else if (instruction == 'R') {
//                Spins the Rover 90 degrees Right without moving from the current coordinate point
                if (directionRover == 'N') {
                    directionRover = 'E';
                }
                if (directionRover == 'S') {
                    directionRover = 'W';
                }
                if (directionRover == 'W') {
                    directionRover = 'N';
                }
                if (directionRover == 'E') {
                    directionRover = 'S';
                }
            } else if (instruction == 'M') {
//                Moves the Rover forward by one grid point
                if (yCoord != yCoord || xCoord != xCoord) {
                    if (directionRover == 'N') {
                        yCoord++;
                    }
                    if (directionRover == 'S') {
                        yCoord--;
                    }
                    if (directionRover == 'W') {
                        xCoord--;
                    }
                    if (directionRover == 'E') {
                        xCoord++;
                    }
                }
            }
            else System.out.println("Invalid Input");

        }
        System.out.println("Position of rover " + xCoord + "," + yCoord + " facing " + directionRover);


    }
}
