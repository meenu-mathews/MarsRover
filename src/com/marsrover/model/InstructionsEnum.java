package com.marsrover.model;

public enum InstructionsEnum {
    L,M,R;
    public static boolean contains(String test) {

        for (InstructionsEnum instructionsEnum : InstructionsEnum.values()) {
            if (instructionsEnum.name().equals(test)) {
                return true;
            }
        }

        return false;
    }
}
