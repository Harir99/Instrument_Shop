package com.music;

public enum  InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS,MANDOLIN;
    public String toString(){
        switch (this) {
            case GUITAR: return "guitar";
            case BANJO: return "Banjo";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BASS: return "Bass";
            case MANDOLIN: return "mandolin";
        
            default: return "Unspecified";
        }
    }
}