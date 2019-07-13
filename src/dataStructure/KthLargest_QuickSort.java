package dataStructure;
//Average case time is O(n), worst case time is O(nˆ 2).

public class KthLargest_QuickSort {

	public int findKthLargest(int[] num,int k) {
		if(k<1||num==null) {
			return 0;
		}
		return getKth(num.length-k+1,num,0,num.length-1);
	}
	public int getKth(int k,int[] num,int start,int end) {
		int pivot=num[end];
		int left=start;
		int right=end;
		while(true) {
			while(num[left]<pivot && left<right) {
				left++;
			}
			while(num[right]>=pivot && left>right) {
				right--;
			}
			if(left==right) {
				break;
			}
			swap(num,left,right);
		}
		if(k==left+1) {
			return pivot;
		}
		else if(k<left+1) {
			return getKth(k, num, start, left-1);
		}else {
			return getKth(k, num, left+1, end);
		}
	}
	private void swap(int[] num, int n1, int n2) {
		int temp=num[n1];
		num[n1]=num[n2];
		num[n2]=temp;
		
	}
	public static void main(String[] args) {
		int[] num= {3,2,1,5,6,7};
		int k=4;
		KthLargest_QuickSort kl=new KthLargest_QuickSort();
		System.out.println(kl.findKthLargest(num, k));
	}
	
}
