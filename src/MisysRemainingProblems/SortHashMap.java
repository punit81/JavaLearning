package MisysRemainingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortHashMap {

	public static void main(String[] args) {
		Map<String,Integer> hmap=new HashMap<String,Integer>();
		hmap.put("Rohan",50);
		hmap.put("Anil",15);
		hmap.put("Charlie",70);
		hmap.put("Sohan",55);
		hmap.put("Bravo",10);
		hmap.put("Micheal",45);
		SortedMap<String,Integer> tmap=new TreeMap<String,Integer>();
		tmap.putAll(hmap);
		System.out.println(tmap);
	}

}
