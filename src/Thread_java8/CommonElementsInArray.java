//Program: Write a program to find common elements between two arrays.
package Thread_java8;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] a1= {1,2,4,6,76,5,3,3,35,5,6};
		int[] a2= {9,8,7,6,5,5,46,35,50};
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.println(a1[i]);
				}
			}
			
		}

	}

}
