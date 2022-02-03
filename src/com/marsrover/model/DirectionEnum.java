package com.marsrover.model;

public enum DirectionEnum {
    N,S,W,E;

    public static boolean contains(String test) {

        for (DirectionEnum directionEnum : DirectionEnum.values()) {
            if (directionEnum.name().equals(test)) {
                return true;
            }
        }

        return false;
    }
}
