package Thread_java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		//Filter Demonstration
		List<String> list=Arrays.asList("Map","filter","Sorted","collection","forEach","Reduce");
		List<String> filter=list.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		System.out.println(filter);
		//Mapping Demo
		List<Integer> number=Arrays.asList(2,5,3,7,2,6,8,9);
		List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		//Sorting demo
		List<String> sort=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		//Collect to Set
		Set<Integer> set=number.stream().collect(Collectors.toSet());
		System.out.println(set);
		//forEach :-The forEach method is used to iterate through every element of the stream.
		number.stream().forEach(y->System.out.println(y));
		
		//reduce: The reduce method is used to reduce the elements of a stream to a single value.
		int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		System.out.println(number.stream().reduce(0,(ans,i)->ans+i));
		
		//Stream API improvements in Java 9
		IntStream.iterate(1,i->i<100,i->i+1).forEach(System.out::println);
		
		//takeWhile(Predicate Interface):takeWhile method takes all the values until the predicate returns false. It returns, in case of ordered stream, a stream consisting of the longest prefix of elements taken from this stream matching the given predicate.
		Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty()).forEach(System.out::print);
		//dropWhile(Predicate Interface):-dropWhile method throw away all the values at the start until the predicate returns true. It returns, in case of ordered stream, a stream consisting of the remaining elements of this stream after dropping the longest prefix of elements matching the given predicate.
		Stream.of("a","b","c","","e","f").dropWhile(s->!s.isEmpty()).forEach(System.out::println);
		//iterate:-iterate method now has hasNext predicate as parameter which stops the loop once hasNext predicate returns false.
		IntStream.iterate(3,x->x<10,x->x+3).forEach(System.out::print);
		//ofNullable:-ofNullable method is introduced to prevent NullPointerExceptions and to avoid null checks for streams. This method returns a sequential Stream containing single element, if non-null, otherwise returns an empty Stream.
		
		//ofNullable:-ofNullable method is introduced to prevent NullPointerExceptions and to avoid null checks for streams. This method returns a sequential Stream containing single element, if non-null, otherwise returns an empty Stream.
		long count=Stream.ofNullable(100).count();
		System.out.println(count);
		count=Stream.ofNullable(null).count();
		System.out.println(count);
		
		int var = 10;
		System.out.println(var);//Valid Declaration
					//Also valid Declaration

	}

}
