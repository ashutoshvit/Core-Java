package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	public int findDuplicateNumber(List<Integer> number) {
		int highestNumber=number.size()-1;
		int total=getSum(number);
		int duplicateNumber= total-(highestNumber*(highestNumber+1)/2);
		return duplicateNumber;
	}

	private int getSum(List<Integer> number) {
		int sum=0;
		for (Integer i : number) {
			sum+=i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<30;i++) {
			list.add(i);
		}
		list.add(22);
		DuplicateNumber dn=new DuplicateNumber();
		System.out.println(dn.findDuplicateNumber(list));
	}

}
