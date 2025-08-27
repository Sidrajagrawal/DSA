package myMap; 
import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("kunal",77);
        map.put("Raj",67);
        map.put("Ankit",97);
        map.put("Puneet",55);
        map.put("Anikta",78);
        map.put("Pcr",39);

        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
    }
}
