package FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("Java 9 Features.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
