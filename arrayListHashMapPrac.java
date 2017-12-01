import java.util.*;
import java.lang.*;

public class arrayListHashMapPrac {

    public static void main(String [] args){
        
        ArrayList<String> solarSystem = new ArrayList<String>();
        
        solarSystem.add("Sun");
        solarSystem.add("Mercury");
        solarSystem.add("Venus");
        solarSystem.add("Earth");
        solarSystem.add("Mars");
        solarSystem.add("Saturn");
        solarSystem.add("Jupiter");
        solarSystem.add("Uranus");
        solarSystem.add("Neptune");
        solarSystem.add("Pluto"); //I think? haha
        
        for(int j = 0; j < solarSystem.size(); j++){
            System.out.println(solarSystem.get(j));
        }
        
        LinkedHashMap<String, Integer> solarSystemHash = new LinkedHashMap<String, Integer>();
        
        solarSystemHash.put("Sun", 0);
        solarSystemHash.put("Mercury", 1);
        solarSystemHash.put("Venus", 2);
        solarSystemHash.put("Earth", 3);
        solarSystemHash.put("Mars", 4);
        solarSystemHash.put("Saturn", 5);
        solarSystemHash.put("Jupiter", 6);
        solarSystemHash.put("Uranus", 7);
        solarSystemHash.put("Neptune", 8);
        solarSystemHash.put("Pluto", 9);
        
        
        
        for(String planet : solarSystemHash.keySet()){
            
            System.out.println(planet + " is the " + solarSystemHash.get(planet) + " position in that order in our solar system.");
        }
        
    }
    
}
