package com.music;
public class Instruments {
    // instance Variables 
    String serialNumber;
    Double price;
    InstrumentSpec spec;
    //-------------------
    public Instruments(String serialNumber, Double price, InstrumentSpec spec){
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }
      
    public String getSerialNumber() {
        return serialNumber;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double newprice) { 
        this.price = newprice;
    }
    public InstrumentSpec getSpec(){
        return spec;
    }

}