package com.marsrover.model;

public class Plateau extends Coordinates{
    int gridXCoord;
    int gridYCoord;

    public void makePlateau() {
        fetchCoordinates("grid");
        gridXCoord = xCoord;
        gridYCoord = yCoord;
    }

}
