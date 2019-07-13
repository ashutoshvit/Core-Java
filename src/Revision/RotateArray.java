package Revision;

public class RotateArray {
	public void rotate(int[] num,int k) {
		if(k>num.length) {
			k=k%num.length;
		}
		int[] result=new int[num.length];
		for(int i=0;i<k;i++) {
			result[i]= num[num.length-k+1];
		}
		int j=0;
		for(int i=k;i<num.length;i++) {
			result[i]=num[j];
			j++;
		}
		System.arraycopy(result, 0, num, 0, num.length);
	}
	
	public static void main(String[] args) {
		int[] num= {1,3,7,4,8,9,3,8,7,3,7,2,8,3};
		int k=2;
		RotateArray ra=new RotateArray();
		ra.rotate(num, k);
	}

}
