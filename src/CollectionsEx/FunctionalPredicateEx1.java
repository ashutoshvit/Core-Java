package CollectionsEx;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class FunctionalPredicateEx1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//print all numbers
		System.out.println("Print all Numbers");
		
		eval(list,n->true);
		System.out.println("");
		System.out.println("Print Odd Number");
		eval(list,n->n%2==0);
		System.out.println("");
		System.out.println("Print numbers greater than 3");
		
		eval(list,n->n>=3);
		System.out.println("");

	}
	
	public static void eval(List<Integer> list,Predicate<Integer> predicate) {
		list.forEach(i->{
			if(predicate.test(i)) {System.out.print(i);}
			
		});
	}

}
