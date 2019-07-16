package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsEx1 {
	public static void main(String[] args) {
	
		List<String> output=StringPermutationsEx1.generatePermutations("xyz");
		System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
        System.out.println("------------------");
	}
	

	private static List<String> generatePermutations(String input) {
		List<String> strlist=new ArrayList<String>();
		StringPermutationsEx1.permutaions("",input, strlist);
		return strlist;
	}

	private static void permutaions(String string, String input, List<String> strlist) {
		if(input.isEmpty()) {
			strlist.add(string+input);
			return;
		}
		for(int i=0;i<input.length();i++) {
			permutaions(string+input.charAt(i), input.substring(0, i)+input.substring(i+1), strlist);
		}
		
	}

}
