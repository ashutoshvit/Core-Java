package Thread_java8;

public class Decimal2Binary {

	public void printBinaryFormat(int num) {
		int binary[]=new int[20];
		int index=0;
		while(num>0)
		{
			binary[index++]=num%2;
			num=num/2;
			
		}
		for(int i=index-1;i>=0;i--) {
			System.out.println(binary[i]);
		}
	}
	public static void main(String[] args) {
		Decimal2Binary db= new Decimal2Binary();
		db.printBinaryFormat(20);

	}

}
