package Thread_java8;

public class NumberReverse {
	
	public int reverseNumber(int num){
		int reverse=0;
		while(num!=0) {
			reverse=(reverse*10)+(num%10);
			num=num/10;
		}
		return reverse;
		}

	public static void main(String[] args) {
		NumberReverse nr= new NumberReverse();
		System.out.println("Result= "+nr.reverseNumber(123456));
	}

}
