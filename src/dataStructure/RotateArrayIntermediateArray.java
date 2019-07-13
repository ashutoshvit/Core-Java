package dataStructure;

import java.util.Arrays;

public class RotateArrayIntermediateArray {

	public void rotate(int[] num,int k) {
		if(k>num.length) {
			k=k%num.length;
		}
		int[] result=new int[num.length];
		for(int i=0;i<k;i++) {
			result[i]=num[num.length-k+i];
			System.out.print(result[i]);
		}
		
		int j=0;
		for (int i=k;i<num.length;i++) {
			result[i]=num[j];
			j++;
			//System.out.print(result[i]);
		}
		//System.arraycopy(result, 0, num, 0, num.length);
		Arrays.copyOf(num, num.length);
	}
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6,7,8,9,10};
		int k=14;
		RotateArrayIntermediateArray rtia=new RotateArrayIntermediateArray();
		rtia.rotate(arr, k);

	}

}
