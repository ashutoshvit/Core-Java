package Java_9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection_Factory_Methods {

	public static void main(String[] args) {
		Set<String> set= Set.of("A","B","C");
		System.out.println(set);
		
		List<String> list=List.of("A","B","C");
		System.out.println(list);
		
		Map<String, String> map=Map.of("A","Ashutosh","B","Binita","C","Caman");
		System.out.println(map);
		

	}

}
