package dataStructure;

import java.util.Arrays;

public class KthLargest {
	public int findKthLargest(int[] num, int k) {
		Arrays.sort(num);
		return num[num.length-k];
	}
	public static void main(String[] args) {
		int[] num= {3,2,1,5,6,7};
		int k=2;
		KthLargest kth=new KthLargest();
		System.out.println(kth.findKthLargest(num, k));
		
		
	}

}
