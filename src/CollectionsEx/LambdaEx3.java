package CollectionsEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer{
	String cname;
	int cid;
	Customer(int cid,String cname){this.cname=cname;this.cid=cid;}
	public String getCname() {
		return cname;
	}
	public int getCid() {
		return cid;
	}
	
	public String toString() {
		return cid+""+cname;
	}
	
	
}
public class LambdaEx3 {

	public static void main(String args[]) {
	List<Customer> cust=new ArrayList<Customer>();
	
	cust.add(new Customer(2,"Ashutosh"));
	cust.add(new Customer(3,"Nikki"));
	cust.add(new Customer(4,"Peehu"));
	
	Collections.sort(cust,(c1,c2)->c1.getCname().compareTo(c2.getCname()));
	System.out.println(cust.toString());
}
}
