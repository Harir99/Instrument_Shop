package com.music;

public enum Style {
    A,B,C,D,E,F;

    public String toString(){
        switch (this) {
            case A: return "a";
            case B: return "b";
            case C: return "c";
            case D: return "d";
            case E: return "e";
            case F: return "f";
            default: return null;
        }
    }
}