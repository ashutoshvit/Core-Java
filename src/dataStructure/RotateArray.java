package dataStructure;

public class RotateArray {

	public static void rotate(int[] arr,int order) {
		if(arr.length==0||arr==null||order<0) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		if(order>arr.length) {
			order=order%arr.length;
		}
		int a=arr.length-order;
		reverse(arr,0,a-1);
		reverse(arr,a,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		
	}
	private static void reverse(int[] arr, int left, int right) {
		if(arr==null||arr.length==1) {
			return;
		}
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int order=4;
		rotate(arr, order);

	}

}
