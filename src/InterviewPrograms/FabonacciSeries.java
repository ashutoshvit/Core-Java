package InterviewPrograms;

public class FabonacciSeries {
	public static void main(String[] args) {
		int fabCount=15;
		int[] fab=new int[fabCount];
		fab[0]=0;
		fab[1]=1;
		for (int i=2;i<fabCount;i++) {
			fab[i]=fab[i-1]+fab[i-2];
		}
		for (int i=0;i<fabCount;i++) {
			System.out.println(fab[i]);
		}
	}

}
