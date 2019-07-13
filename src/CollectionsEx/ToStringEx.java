package CollectionsEx;
class Student1{
	String sName;
	int roll;
	Student1(String sname,int roll){
		this.sName=sname;
		this.roll=roll;
		
	}
	
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(roll);
		
	}
	
}
public class ToStringEx {

	public static void main(String[] args) {
		Student1 s1=new Student1("Ashutosh",11468142);
		Student1 s2=new Student1("Nikki", 1096983);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());;

	}

}
