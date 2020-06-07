package com.music;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class findGuitar {
 
    public static void main(String[] args) {
        // Set up Rick’s inventory
        inventory Inventory = new inventory();
        initializeInventory(Inventory);

        Map<String,Object> properties = new HashMap<>();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("model", "CJ");

        InstrumentSpec clientSpec = new InstrumentSpec(properties);
        List<Instruments> matchingInstruments = Inventory.search(clientSpec);
        printInstrument(matchingInstruments);

        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        InstrumentSpec clientSpec2 = new InstrumentSpec(properties);
        List<Instruments> matchingInstruments2 = Inventory.search(clientSpec2);
        printInstrument(matchingInstruments2);
        
    }
    private static void initializeInventory(inventory inv){
        Map<String,Object> properties = new HashMap<>();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        inv.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.MARTIN);
        properties.put("model", "D-18");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.ADIRONDACK);
        inv.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inv.addInstrument("V95693", 1499.95,new InstrumentSpec(properties));
        inv.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));

    }
    private static void  printInstrument(List<Instruments> matchingInstruments){
        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments:");
              for (Iterator<Instruments> i = matchingInstruments.iterator(); i.hasNext(); ) {
  
                  Instruments instrument = (Instruments)i.next();
                  InstrumentSpec spec = instrument.getSpec();
                  System.out.println("We have a " + spec.getProperty("instrumentType") +" with the following properties:");
  
                  for (Iterator<String> j = spec.getProperties().keySet().iterator();j.hasNext(); ) {
                      String propertyName = (String)j.next();
                      
                      if (propertyName.equals("instrumentType"))
                      continue;
  
                      System.out.println(" " + propertyName + ": " +
                      spec.getProperty(propertyName));
                  }
  
                  System.out.println(" You can have this " +
                  spec.getProperty("instrumentType") + " for $" +
                  instrument.getPrice() + "\n---");
              }
          } 
          else {
          System.out.println("Sorry, we have nothing for you.");
          }
    }
}
