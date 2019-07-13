package dataStructure;

public class TwoSumDemo {
	public static int[] twoSum(int[] num,int target) {
		int[] ret=new int[2];
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					System.out.println(ret[0]=i+1);
					System.out.println(ret[1]=j+1);
				}
			}
		}
		return ret;
		
	}
	public static void main(String args[]) {
		int[] num= {2,7,11,15};
		int target=9;
		TwoSumDemo.twoSum(num, target);
	}

}
