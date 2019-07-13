package InterviewPrograms;

public class MyArmstrongNumber {
	public boolean isArmStrongNumber(int number) {
		int temp=number;
		int numberOfDigits=String.valueOf(number).length();
		int sum=0;
		int div=0;
		while(temp>0) {
			div=temp%10;
			int tmp=1;
			for(int i=0;i<numberOfDigits;i++) {
				tmp*=div;
			}
			sum+=tmp;
			temp=temp/10;
		}
		if(number==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		MyArmstrongNumber nam=new MyArmstrongNumber();
		System.out.println(nam.isArmStrongNumber(371));;

	}

}
