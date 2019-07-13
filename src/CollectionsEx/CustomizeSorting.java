package CollectionsEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class CustomizeSorting implements Comparator<Integer>{
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(5);
		list.add(5);
		
		System.out.println("List Before any changes" + list);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		
		return o1.compareTo(o2);
	}
	
}