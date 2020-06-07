package com.music;

import java.util.*;

public class inventory {
    private List<Instruments> Inventory;

    public inventory(){
        Inventory = new LinkedList<Instruments>();
    }

    void addInstrument(String serialNumber, Double price, InstrumentSpec spec){
        Instruments instrument = new Instruments(serialNumber, price, spec);
        Inventory.add(instrument);
    }
    public Instruments getInstrument (String serialNumber){
        // check if there is another token 
       for (Iterator<Instruments> i = Inventory.iterator(); i.hasNext();) {
           // if there is, then keep iterating till you reach the serial number 
           Instruments instrument = (Instruments) i.next();
           if (instrument.getSerialNumber().equals(serialNumber)) {
               return instrument;
           }
       }
       return null;
    }
    public List<Instruments> search(InstrumentSpec searchSpec){
        List<Instruments> matchingInstruments = new LinkedList<Instruments>();
        for (Iterator<Instruments> i = Inventory.iterator(); i.hasNext();) {
            // if there is, then keep iterating till you reach the serial number 
            Instruments instrument = (Instruments) i.next();
            if(instrument.getSpec().matches(searchSpec)){
                matchingInstruments.add(instrument);
            }
        
     }
     return matchingInstruments;
    }
}