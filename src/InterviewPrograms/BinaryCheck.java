package InterviewPrograms;

public class BinaryCheck {
	public boolean isBinaryNumer(int number) {
		boolean status=true;
		while(true) {
			if(number==0) {
				break;
			}
			else {
				int temp=number%10;
				if(temp>1) {
					status=false;
					break;
				}
				number=number/10;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		BinaryCheck bc=new BinaryCheck();
		System.out.println("Is 1000111 binary? :"+bc.isBinaryNumer(1000111));
	    System.out.println("Is 10300111 binary? :"+bc.isBinaryNumer(10300111));
	}

}
