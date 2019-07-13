package CollectionsEx;

import java.util.ArrayList;

public class LambdaArrayListEx {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			al.add(i);
		}
		
		al.forEach(n->System.out.print(n));
		System.out.println();
		al.forEach(n->{if(n%2==0) System.out.print(n);});
	}
}