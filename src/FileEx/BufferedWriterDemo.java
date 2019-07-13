package FileEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("ashu.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		char[] chi= {'A','S','H','U','T','O','S','H'};
		bw.write(chi);
		bw.newLine();
		bw.write(100);
		bw.newLine();
		bw.write("Senior Software Engineer");
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
