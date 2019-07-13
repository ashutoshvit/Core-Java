package FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("Output.txt");
		BufferedReader br1=new BufferedReader(new FileReader("ashu.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("Java 9 Features.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null) {
			
				pw.println(line1);
				line1=br1.readLine();
			
		}
		while(line2!=null) {
				pw.println(line2);
				line2=br2.readLine();
		}
		pw.flush();
		
		br1.close();
		br2.close();
		pw.close();
		

	}

}
