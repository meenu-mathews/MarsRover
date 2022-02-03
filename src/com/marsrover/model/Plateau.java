package com.marsrover.model;

import java.util.Locale;
import java.util.Scanner;

public class Plateau {
    int xCoord = 0;
    int yCoord = 0;

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
    public void setCoordinates(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    public void makePlateau() {

        String[][] grid = new String[xCoord][yCoord];
        System.out.println("["+xCoord+"]["+yCoord+"] grid created");

        System.out.println("Enter rover's coordinates and direction (N,S,W,E)");
        Scanner scannerObj = new Scanner(System.in);
        int xCoordRover = scannerObj.nextInt();
        int yCoordRover = scannerObj.nextInt();
        char directionRover = Character.toUpperCase(scannerObj.next(".").charAt(0));
        grid[xCoordRover][yCoordRover] = "Rover present";

        System.out.println(grid[xCoordRover][yCoordRover] + " at ["+xCoordRover+"]["+yCoordRover+"] facing "+directionRover);

        System.out.println("Enter instructions (L,R,M) to move the Rover around the Plateau ");
        String roverMoveInstruction = scannerObj.next();

        for(int i = 0; i<roverMoveInstruction.length(); i++) {

            char instruction = roverMoveInstruction.toUpperCase(Locale.ROOT).charAt(i);
            if(instruction == 'L'){
//                Spins the Rover 90 degrees Left without moving from the current coordinate point
                if (directionRover == 'N') {
                    directionRover = 'W';
                }
                else if (directionRover == 'S') {
                    directionRover = 'E';
                }
                else if (directionRover == 'W') {
                    directionRover = 'S';
                }
                else if (directionRover == 'E') {
                    directionRover = 'N';
                }
            }
            else if(instruction == 'R'){
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
            }
            else if(instruction == 'M') {
//                Moves the Rover forward by one grid point
                if (yCoordRover != yCoord || xCoordRover != xCoord) {
                    if (directionRover == 'N') {
                        yCoordRover++;
                    }
                    if (directionRover == 'S') {
                        yCoordRover--;
                    }
                    if (directionRover == 'W') {
                        xCoordRover--;
                    }
                    if (directionRover == 'E') {
                        xCoordRover++;
                    }
                }
            }

        }
        System.out.println("Position of rover "+ xCoordRover+","+yCoordRover+" facing "+directionRover);
    }
}
