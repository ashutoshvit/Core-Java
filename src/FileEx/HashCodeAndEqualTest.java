package FileEx;

public class HashCodeAndEqualTest {

	String name;
	 int rollNo;
	HashCodeAndEqualTest(String name, int rollNo){
		 this.name=name;
		 this.rollNo=rollNo;
	}
	public static void main(String[] args) {
		HashCodeAndEqualTest hce=new HashCodeAndEqualTest("Ashutosh", 101);
		HashCodeAndEqualTest hce1=new HashCodeAndEqualTest("Ashutosh", 101);
		HashCodeAndEqualTest hce2=new HashCodeAndEqualTest("Shan",103);
		HashCodeAndEqualTest hce3=hce;
		
		System.out.println(hce.equals(hce1));
		
		System.out.println(hce1.equals(hce2));
		
		System.out.println(hce3.equals(hce));
		

	}

}