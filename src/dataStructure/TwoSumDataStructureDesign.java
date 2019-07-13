package dataStructure;

import java.util.HashMap;

public class TwoSumDataStructureDesign {
	private HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
	public void add(int num) {
		if(map.containsKey(num)) {
			map.put(num, map.get(num)+1);
		}else {
			map.put(num, 1);
		}
	}
	
	public boolean find(int value) {
		for(Integer i:map.keySet()) {
			int target = value-1;
			if(map.containsKey(target)) {
				if(i==target && map.get(target)<2) {
					continue;
				}
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		map.put(0, 0);
		map.put(1, 1);
		map.put(1, 2);
		map.put(2, 2);
		
		TwoSumDataStructureDesign two=new TwoSumDataStructureDesign();
		System.out.println(two.find(1));

	}

}
