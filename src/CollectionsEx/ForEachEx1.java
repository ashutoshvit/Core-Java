package CollectionsEx;

import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Ashutosh","Peehu","Nikki","Ankit");
		//list.forEach(lists->System.out.println(list+" "));
		//System.out.println("");
		list.forEach(System.out::println);

	}

}
