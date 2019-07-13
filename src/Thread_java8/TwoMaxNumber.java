package Thread_java8;

public class TwoMaxNumber {

	public void printTwoMaxNumber(int[] num) {
		int maxOne=0;
		int maxTwo=0;
		for(int n:num) {
			if(maxOne<n) {
				maxTwo=maxOne;
				maxOne=n;
			}
			else if(maxTwo<n) {
				maxTwo=n;
				
			}
			
		}
		
		System.out.println("MAX One Number= "+ maxOne);
		System.out.println("MAX Two Number=  "+maxTwo);
		
	}
	public static void main(String[] args) {
		int num[] ={1,4,6,7,8,5,55,4,45,5,6,6,7,7,5,4,43,5,5,5,5,44};
		TwoMaxNumber tmn= new TwoMaxNumber();
		tmn.printTwoMaxNumber(num);

	}

}
