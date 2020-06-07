package com.music;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {

    private Map <String,Object> properties;
    

    public InstrumentSpec(Map <String,Object> properties){
        if(properties == null){
            this.properties = new HashMap<>();
        }
        else {
            this.properties = new HashMap<>(properties);
        }
    }
    public Object getProperty(String PropertryName){
        return properties.get(PropertryName);
    }

    public Map<String,Object> getProperties (){
        return properties;
    }
    
    public boolean matches (InstrumentSpec someSpec){
        for (Iterator<String> i = someSpec.getProperties().keySet().iterator(); i.hasNext();) {
            String propertyName = (String) i .next();
            if(!properties.get(propertyName).equals(someSpec.getProperty(propertyName))){
                return false;
            }
        }
     return true;
     }
    
}