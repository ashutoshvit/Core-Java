package CollectionsEx;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class Student{
	String sname;
	int roll;
	Student(String sname,int roll){this.roll=roll; this.sname=sname;}
	public String getSname() {
		return sname;
	}
	public int getRoll() {
		return roll;
	}
	
	@Override
	public String toString() {
		return sname+"  "+roll;
	}
	
	
}
class SnoSort implements Comparator<Student>{

	
	public int compare(Student s1,Student s2) {
		Integer r1=s1.getRoll();
		Integer r2=s2.getRoll();
		return r1.compareTo(r2);
}
}
public class DefaultEx {
	public static void main(String args[]) {
	List<Student> list =new Vector<Student>();
	list.add(new Student("Ashutosh",2));
	list.add(new Student("Nikki",3));
	list.add(new Student("Peehu",4));
	
	System.out.println(list.toString());
	
	list.sort(new SnoSort());
	System.out.println(list.toString());
	}
}
