package FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFilestoOne {

	
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("Output.txt");
		BufferedReader br=new BufferedReader(new FileReader("ashu.txt"));
		String line=br.readLine();
		while(line!=null) {
			pw.println();
			line=br.readLine();
			System.out.println(br.readLine());
		}
		br=new BufferedReader(new FileReader("Java 9 Features.txt"));
		line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
			System.out.println(br.readLine());
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
