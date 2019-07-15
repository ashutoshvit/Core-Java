package InterviewPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FindTwoLinesWithMaxCharactorDesending {
	public static void main(String args[]) {
	BufferedReader br=null;
	String filePath=null;
	int topList=0;
	Set<Entries> liSet=new TreeSet<Entries>(new MyComparator());
	try {
		br=new BufferedReader(new FileReader(new File(filePath)));
		String line=br.readLine();
		topList=Integer.parseInt(line.trim());
		while((line = br.readLine()) != null){
            line = line.trim();
            if(!"".equals(line)){
                liSet.add(new Entries(line.length(), line));
            }
        }
		int count=0;
		for(Entries ent:liSet) {
			System.out.println(ent.line);
			if(++count==topList) {
				break;
			}
		}		
	}
	catch(FileNotFoundException ex) {ex.printStackTrace();}
	catch(IOException ex) {ex.printStackTrace();}
	
	}

	public static class Entries{
		Integer lenght;
		String line;
		public Entries(Integer lenght, String line) {
			this.lenght=lenght;
			this.line=line;
		}
		
	}
	public static class MyComparator implements Comparator<Entries> {

		@Override
		public int compare(Entries o1, Entries o2) {
			if(o2.lenght>o1.lenght) {
				return 1;
			}else {
			return -1;
			}
		}
		
	}
}


