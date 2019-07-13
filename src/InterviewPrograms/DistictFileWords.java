package InterviewPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DistictFileWords {
	public List<String> getDistictFileWords(String fileName) throws FileNotFoundException, IOException{
		FileInputStream fis=null;
		DataInputStream dis=null;
		BufferedReader br=null;
		List<String> wordList=new ArrayList<String>();
		try {
			fis=new FileInputStream(fileName);
			dis=new DataInputStream(fis);
			br=new BufferedReader(new InputStreamReader(dis));
			String line=null;
			while((line=br.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(line, " ");
				while(st.hasMoreTokens()) {
					String temp=st.nextToken();
					if(!wordList.contains(temp)) {
						wordList.add(temp);
					}
				}
			}
		}
		finally {
			try {
				if(br!=null) br.close();
			}catch(Exception ex) {ex.printStackTrace();};

		}
		return wordList;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		DistictFileWords df=new DistictFileWords();
		List<String> wordList=df.getDistictFileWords("C:/Users/ashutosh_kumar/SW/eclipse-workspace/Ex1/Java 9 Features.txt");
		for(String str:wordList) {
			System.out.println(str);
		}
	}

}
