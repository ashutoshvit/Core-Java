package CollectionsEx;

import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableEx {

	public static void main(String[] args) {
		NavigableSet n=new TreeSet();
		n.add(100);
		n.add(200);
		n.add(20);
		n.add(40);
		n.add(320);
		System.out.println(n);
		
		System.out.println("Ceiling="+n.ceiling(200));
		System.out.println("Head"+n.higher(20));
		System.out.println("Floor" + n.floor(200));
		System.out.println("Pull Firsst"+n.pollFirst());
		System.out.println("Pull Last " +n.pollLast());
	}

}
