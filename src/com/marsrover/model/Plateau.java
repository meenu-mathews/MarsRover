package com.marsrover.model;

import java.util.Locale;
import java.util.Scanner;

public class Plateau {


    public Plateau(int xCoord, int yCoord) {

        String[][] grid = new String[xCoord][yCoord];
        System.out.println("["+xCoord+"]["+yCoord+"] grid created");

        System.out.println("Enter rover's coordinates and direction (N,S,W,E)");
        Scanner scannerObj = new Scanner(System.in);
        int xCoordRover = scannerObj.nextInt();
        int yCoordRover = scannerObj.nextInt();
        char directionRover = scannerObj.next(".").charAt(0);
        grid[xCoordRover][yCoordRover] = "Rover present";

        System.out.println(grid[xCoordRover][yCoordRover] + " at ["+xCoordRover+"]["+yCoordRover+"] facing "+directionRover);

        System.out.println("Enter instructions (L,R,M) to move the Rover around the Plateau ");
        String roverMove = scannerObj.nextLine();
        
        for(int i = 0; i<roverMove.length(); i++) {

            char instruction = roverMove.toUpperCase(Locale.ROOT).charAt(i);
            if(instruction == 'L')
            System.out.print(instruction + ", ");
        }
    }
}
