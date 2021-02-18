package MisysRemainingProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		//Second method without using TreeMap
		Map<String,Integer>lmap=new LinkedHashMap<String,Integer>();
		Set<String> keys=hmap.keySet();
		List<String> alist=new ArrayList();
		alist.addAll(keys);
		alist.sort(new Comparator<String>() {
			public int compare(String str1,String str2) {
				return str1.compareTo(str2);
			}
		});
		alist.forEach(al->lmap.put(al, hmap.get(al)));
		System.out.println(lmap);
	}

}
