package Thread_java8;

public class FindPrimeNumber {

	public boolean isPrimeNumber(int num) {
		for(int i=0;i<num/2;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		FindPrimeNumber fpn=new FindPrimeNumber();
		System.out.println("Is 17 prime number?"+fpn.isPrimeNumber(17));
		System.out.println("Is 20 prime number?"+fpn.isPrimeNumber(20));
		System.out.println("Is 57 prime number?"+fpn.isPrimeNumber(57));
		System.out.println("Is 13 prime number?"+fpn.isPrimeNumber(13));

	}

}
