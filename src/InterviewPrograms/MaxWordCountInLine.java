package InterviewPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxWordCountInLine {
	private int currentMaxCount=0;
	List<String> lines=new ArrayList<String>();
	private void readMaxLineCount(String fileName) {
		FileInputStream fis=null;
		DataInputStream dis=null;
		BufferedReader br=null;
		try{
			fis=new FileInputStream(fileName);
			dis=new DataInputStream(fis);
			br=new BufferedReader(new InputStreamReader(dis));
			String line=null;
			while((line=br.readLine())!=null) {
				int count=(line.split("\\s+")).length;
				if(count>currentMaxCount) {
					lines.clear();
					lines.add(line);
					currentMaxCount=count;
				}
				else if(count==currentMaxCount) {
					lines.add(line);
					
				}
			}
		}
		catch(FileNotFoundException ex){ex.printStackTrace();}
		catch(IOException ex){ex.printStackTrace();}
		finally {
			try {
				if(br!=null) {br.close();}
			}catch(Exception ex) {ex.printStackTrace();}
		}
		
	}
	public int getCurrentMaxCount() {
		return currentMaxCount;
	}
	public void setCurrentMaxCount(int currentMaxCount) {
		this.currentMaxCount=currentMaxCount;
	}
	public List<String> getLines(){
		return lines;
	}
	public void setLines(List<String> lines) {
		this.lines=lines;
	}
	public static void main(String[] args) {
		MaxWordCountInLine mwc=new MaxWordCountInLine();
		mwc.readMaxLineCount("C:/Users/ashutosh_kumar/SW/eclipse-workspace/Ex1/Java 9 Features.txt");
		System.out.println("Max number of words in line is :"+mwc.getCurrentMaxCount());
		System.out.println("Line with Max word Count :");
		List<String> lines=mwc.getLines();
		for(String l:lines) {
			System.out.println(l);
		}
	}

}
