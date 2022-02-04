package com.marsrover.model;
import java.util.Locale;
import java.util.Scanner;


public class MarsRover extends Coordinates {
    Scanner scannerObj = new Scanner(System.in);
    String directionRover;
    char instruction;
    String roverMoveInstruction;


    public void getRoverDetails() {
        System.out.println("Enter rover direction (N,S,W,E)");
        directionRover = String.valueOf(scannerObj.next().charAt(0)).toUpperCase(Locale.ROOT);

        if (DirectionEnum.contains(directionRover)) {
            System.out.println("Rover at [" + xCoord + "][" + yCoord + "] facing " + directionRover);
        }
        else
            System.out.println("Invalid input");
    }
    public String moveRover(int gridX, int gridY){
        System.out.println("Enter instructions (L,R,M) to move the Rover around the Plateau ");
        roverMoveInstruction = scannerObj.next();

        for (int i = 0; i < roverMoveInstruction.length(); i++) {

            instruction = roverMoveInstruction.toUpperCase(Locale.ROOT).charAt(i);
            if(InstructionsEnum.contains(String.valueOf(instruction))){
                if ((String.valueOf(instruction)).equals(InstructionsEnum.L.name())) {
//                Spins the Rover 90 degrees Left without moving from the current coordinate point
                    if (directionRover.equals(DirectionEnum.N.name())) {
                        directionRover = "W";
                    } else if (directionRover.equals(DirectionEnum.S.name())) {
                        directionRover = "E";
                    } else if (directionRover.equals(DirectionEnum.W.name())) {
                        directionRover = "S";
                    } else if (directionRover.equals(DirectionEnum.E.name())) {
                        directionRover = "N";
                    }
                } else if ((String.valueOf(instruction)).equals(InstructionsEnum.R.name())){
//                Spins the Rover 90 degrees Right without moving from the current coordinate point
                    if (directionRover.equals(DirectionEnum.N.name())) {
                        directionRover = "E";
                    }
                    if (directionRover.equals(DirectionEnum.S.name())) {
                        directionRover = "W";
                    }
                    if (directionRover.equals(DirectionEnum.W.name())) {
                        directionRover = "N";
                    }
                    if (directionRover.equals(DirectionEnum.E.name())) {
                        directionRover = "S";
                    }
                } else if ((String.valueOf(instruction)).equals(InstructionsEnum.M.name())){
//                Moves the Rover forward by one grid point

                    if (yCoord != gridY  || xCoord != gridX) {
                        if (directionRover.equals(DirectionEnum.N.name()))
                            yCoord++;
                        if (directionRover.equals(DirectionEnum.S.name()))
                            yCoord--;

                        if (directionRover.equals(DirectionEnum.W.name()))
                            xCoord--;

                        if (directionRover.equals(DirectionEnum.E.name()))
                            xCoord++;

                    }
                }
            }
            else System.out.println("Invalid Input");

        }
        System.out.println("Rover at [" + xCoord + "][" + yCoord + "] facing " + directionRover);

        return xCoord+" "+yCoord+" "+directionRover;
    }
}


