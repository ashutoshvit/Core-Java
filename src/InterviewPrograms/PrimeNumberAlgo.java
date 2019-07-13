package InterviewPrograms;

public class PrimeNumberAlgo {

	public boolean isPrimeNumber(int number) {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumberAlgo pna=new PrimeNumberAlgo();
		System.out.println(pna.isPrimeNumber(19));

	}

}
