import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import CollectionsEx.Test;

public class SerializeDemo {
	public static void main(String args[]) {
		Test t=new Test();
		t.name = "Reyan Ali";
	      t.address = "Phokka Kuan, Ambehta Peer";
	      t.SSN = 11122333;
	      t.number = 101;
	      try {
	          FileOutputStream fileOut =
	          new FileOutputStream("/tmp/employee.ser");
	          ObjectOutputStream out = new ObjectOutputStream(fileOut);
	          out.writeObject(t);
	          out.close();
	          fileOut.close();
	          System.out.printf("Serialized data is saved in /tmp/employee.ser");
	       } catch (IOException i) {
	          i.printStackTrace();
	       }
	
		
	}

}
