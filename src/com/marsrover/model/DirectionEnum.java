package com.marsrover.model;

public enum DirectionEnum {
    North("N"),
    South ("S"),
    West("W"),
    East("E");
    private String dir;
    private DirectionEnum(String direction) {
        this.dir = direction;
    }



    public static boolean contains(String test) {

        for (DirectionEnum directionEnum : DirectionEnum.values()) {
            if (directionEnum.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        return dir;
    }
}

