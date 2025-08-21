package Map;
import java.util.*;

public class LinkedHashMap_Demo {
	public static void main(String args[]) {
		LinkedHashMap<String,Integer> Lmap = new LinkedHashMap<>();
		Lmap.put("kunal",77);
		Lmap.put("Raj",67);
		Lmap.put("Ankit",97);
		Lmap.put("Puneet",55);
		Lmap.put("Anikta",78);
		Lmap.put("Pcr",39);
		System.out.println(Lmap);
	}
}
