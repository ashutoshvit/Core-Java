package FileEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("ashu.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('A');
		pw.println("Ashutosh Kumar Kashyap");
		pw.print(10.234);
		pw.flush();
		pw.close();
	}

}
