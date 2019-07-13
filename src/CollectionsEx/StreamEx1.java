package CollectionsEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
	public static void main(String args[])
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer result=list.stream().map(e->e*2).reduce(0,(c,e)->c+e);//Steam API
		System.out.println(result);
	}

}
