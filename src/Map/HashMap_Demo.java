package Map;
import java.util.*;

public class HashMap_Demo {
	public static void main(String args[]) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("kunal",77);
		map.put("Raj",67);
		map.put("Ankit",97);
		map.put("Puneet",55);
		map.put("Anikta",78);
		map.put("Pcr",39);
		System.out.println(map);
		
		// get
		System.out.println(map.get("Kaju"));
		System.out.println(map.get("Puneet"));
		
		//  ContainsKey
		System.out.println(map.containsKey("Puneet"));
		
		//remove
		System.out.println(map.remove("Kaju"));
		System.out.println(map.remove("Anikta"));
		System.out.println(map);
		for(String k: map.keySet()) {
			System.out.print(k+" "+map.get(k));
		}
	}
}
