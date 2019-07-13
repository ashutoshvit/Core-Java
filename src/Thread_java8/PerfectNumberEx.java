package Thread_java8;

public class PerfectNumberEx {

	public boolean PerfectNumber(int num) {
		int temp=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			temp +=i;
			
		}
		if(temp==num) {
			System.out.println("It is a perfect number");
			return true;
			
		}
		else {
			System.out.println("It is not a perfect number");
			return false;
		}
	}
	public static void main(String[] args) {
		PerfectNumberEx pn=new PerfectNumberEx();
		System.out.println("Is Perfect Number: "+ pn.PerfectNumber(28));

	}

}
