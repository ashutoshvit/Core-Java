package CollectionsEx;
import java.util.*;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap t= new TreeMap(new MyComparator());
		t.put(100, "Ashutosh");
		t.put(50,"Nikki");
		t.put(150, "Peehu");
		//t.put(null, "Ankit");
		//t.put("Nikki", "Nikki");
		System.out.println(t);

	}

}
class MyComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return -s2.compareTo(s1);
				
	}
}
