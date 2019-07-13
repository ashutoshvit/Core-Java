//Find out duplicate number between 1 to N numbers.
package Thread_java8;
import java.util.List;
import java.util.ArrayList;


public class DuplicateEx {

	public int findDuplicateNumber(List<Integer> list) {
		int highestNumber=list.size()-1;
		int total=getSum(list);
		int duplicate=total-(highestNumber*(highestNumber+1)/2);
		return duplicate;
		
	}
	public int getSum(List<Integer> list) {
		int sum=0;
		for(int num:list) {sum+=num;}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<30;i++) {
			list.add(i);
		}
		
		list.add(22);
		DuplicateEx d=new DuplicateEx();
		System.out.println("Duplicate Number"+d.findDuplicateNumber(list));

	}

}
