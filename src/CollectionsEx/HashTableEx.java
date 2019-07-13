package CollectionsEx;
import java.util.Hashtable;
import java.util.Comparator;
public class HashTableEx {

	public static void main(String[] args) {
		Hashtable t = new Hashtable();
		t.put(new Temp(5), "Ashutosh");
		t.put(new Temp(2),"Nikki");
		t.put(new Temp(6),"Peehu");
		t.put(new Temp(3),"Ankit");
		System.out.println(t);

	}

}

class Temp{
	int i;
	Temp(int i){
		this.i=i;
		
	}
	public int hasCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}