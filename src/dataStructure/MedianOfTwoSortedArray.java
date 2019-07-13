package dataStructure;

public class MedianOfTwoSortedArray {

	public static double findMedianSortedArrays(int[] A,int[] B) {
		int m=A.length;
		int n=B.length;
		if((m+n)%2!=0) {//odd
			return (double)findKth(A,B,(m+n)/2,0,m-1,0,n-1);
		}
		else {//even
			return (findKth(A,B,(m+n)/2,0,m-1,0,n-1) + findKth(A,B,(m+n)/2-1,0,m-1,0,n-1))*0.5;
		}
	}
	public static int findKth(int[] A,int B[],int k,int aStart,int aEnd, int bStart,int bEnd) {
		int aLen=aEnd-aStart+1;
		int bLen=bEnd-bStart+1;
		//Handle Special Condition
		if(aLen==0) {
			return B[bStart +k];
			}
		if(bLen==0) {
			return A[aStart+k];
		}
		if(k==0) {
			return A[aStart]<B[bStart]? A[aStart]:B[bStart];
		}
		
		int aMid=aLen*k/(aLen+bLen); // a’s middle count 
		int bMid=k-aMid-1;//b's middle
		
		aMid=aMid+aStart;
		bMid=bMid+bStart;
		
		if(A[aMid]>B[bMid]) {
			k=k-(bMid-bStart+1);
			aEnd=aMid;
			bStart=bMid+1;
			
		}
		else {
			bEnd=bMid;
			aStart=aMid+1;
		}
		System.out.println(k);
		return findKth(A,B,k,aStart,aEnd,bStart,bEnd);
	}
	public static void main(String[] args) {
	 int[] A= {1,2,3};
	 int[] B= {4,5};
	 MedianOfTwoSortedArray.findMedianSortedArrays(A, B);
	 
	}
}
