package InterviewPrograms;

public class MyNumberSumRec {

	int sum=0;
	public int getNumSum(int number) {
		if(number==0) {
			return sum;
		}
		else {
				sum+=(number)%10;
				getNumSum(number/10);
		}
		return sum;
	}
	public static void main(String[] args) {
		MyNumberSumRec mns=new MyNumberSumRec();
		System.out.println(mns.getNumSum(75847475));

	}

}
