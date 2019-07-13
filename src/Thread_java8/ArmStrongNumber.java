package Thread_java8;

public class ArmStrongNumber {
	
	public boolean IsArmStrongNumber(int num) {
		int temp=num;
		int noOfDigits=String.valueOf(num).length();
		int sum=0;
		int div=0;
		while(temp>0) {
			div =temp%10;
			int tmp = 1;
			for(int i=0;i<noOfDigits;i++) {
				tmp*=div;
			}
			sum+=tmp;
			temp=temp/10;
			
		}
		if(num==sum) {
			return true;
			
		}
		else return false;
		
	}

	public static void main(String[] args) {
		ArmStrongNumber asn=new ArmStrongNumber();
		System.out.println("Is ArmStrong Number : "+asn.IsArmStrongNumber(371));
		System.out.println("Is ArmStrong Number : "+asn.IsArmStrongNumber(523));
		System.out.println("Is ArmStrong Number : "+asn.IsArmStrongNumber(153));

	}

}
