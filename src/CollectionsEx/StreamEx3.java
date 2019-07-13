package CollectionsEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamEx3 {

	public static void main(String[] args) {
		List<String> family = Arrays.asList("Ashutosh","Nikki","Peehu", "Ankit");
		List<String> capfam=new ArrayList<String>();
		
		Stream<String> newStream=family.stream().filter(name->name.startsWith("N"));
		capfam=newStream.collect(Collectors.toList());
		System.out.println(capfam);

	}

}
