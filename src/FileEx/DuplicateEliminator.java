package FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateEliminator {

	public static void main(String[] args) throws IOException {
		BufferedReader br1=new BufferedReader(new FileReader("ashu.txt"));
		PrintWriter pw=new PrintWriter("output.txt");
		String line=br1.readLine();
		while(line!=null) {
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("output.txt"));
			String target=br2.readLine();
			while(target!=null) {
				if(line.equals(target)) {
					available=true;
					break;
				}
				target=br2.readLine();
			}
			if(available==false) {
				pw.println(line);
				pw.flush();
			}
			line=br1.readLine();
			br2.close();
		}
		pw.flush();
		br1.close();
		pw.close();

	}

}
