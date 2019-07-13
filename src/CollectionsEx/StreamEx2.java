package CollectionsEx;
import java.util.*;

public class StreamEx2 {

	public static void main(String[] args) {
		List<String> family=Arrays.asList("Ashutosh","Nikki","Peehu","Ankit");
		List<String> capfam=new ArrayList<String>();
		
		family.stream().map(name->name.toUpperCase()).forEach(name->capfam.add(name));
		System.out.println(capfam);
		
		
		//Stream API using Lambda expression
		family.stream().map(String::toUpperCase).forEach(name->capfam.add(name));

	}

}
