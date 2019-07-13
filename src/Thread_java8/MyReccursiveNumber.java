//Write a program to find sum of each digit in the given number using recursion.
package Thread_java8;

public class MyReccursiveNumber {

	int sum=0;
	public int getNumberSum(int num) {
		if(num==0) {
		return sum;
		}
		else {
			sum+=num%10;
			getNumberSum(num/10);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		MyReccursiveNumber mrn=new MyReccursiveNumber();
		System.out.println("Sum is : "+mrn.getNumberSum(945721));

	}

}
