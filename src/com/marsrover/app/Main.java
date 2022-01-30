package com.marsrover.app;
import com.marsrover.model.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter max coordinates of plateau");

        int xCoord = scannerObj.nextInt();
        int yCoord = scannerObj.nextInt();

        Plateau plateauObj = new Plateau(xCoord,yCoord);
    }
}


