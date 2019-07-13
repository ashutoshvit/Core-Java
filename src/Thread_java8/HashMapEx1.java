//Sort or order a HashMap or TreeSet or any map item by value. Write a comparator
//which compares by value, not by key. Entry class might helps you here.
package Thread_java8;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Ashutosh", 12);
		map.put("Nikki", 13);
		map.put("Archana", 10);
		map.put("Peehu", 1);
		map.put("Ankit", 14);
		map.put("I love you", 7);
		
	    Set<Entry<String,Integer>> set = map.entrySet();
	    List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
	    
		
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>()
		{
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(Map.Entry<String,Integer> entry:list) {
			System.out.println(entry.getKey()+"..............."+entry.getValue());
		}

	}

}
