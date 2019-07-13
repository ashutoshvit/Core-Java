package CollectionsEx;
import java.io.Serializable;

public class Test implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1024L;
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	public void mail(){
		System.out.println("Mailing a check to " + name + " " + address);
	}
	

}
