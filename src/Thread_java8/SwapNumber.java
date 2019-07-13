package Thread_java8;

public class SwapNumber {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Numbers before Swap");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers After Swap");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);

	}

}
