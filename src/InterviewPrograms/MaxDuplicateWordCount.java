package InterviewPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxDuplicateWordCount {
	public Map<String,Integer> getWordCount(String fileName){
		FileInputStream fis;
		DataInputStream dis;
		BufferedReader br = null;
		Map<String,Integer> wordMap=new HashMap<String,Integer>();
		try {
			fis=new FileInputStream(fileName);
			dis=new DataInputStream(fis);
			br=new BufferedReader(new InputStreamReader(dis));
			String	 line=null;
			while((line=br.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(line, " ");
				while(st.hasMoreTokens()) {
					String temp=st.nextToken().toLowerCase();
					if(wordMap.containsKey(temp)) {
						wordMap.put(temp, wordMap.get(temp)+1);
					}
					else {wordMap.put(temp, 1);}
				}
			}
			
		}
		catch(FileNotFoundException ex) {ex.printStackTrace();}
		catch(IOException ex) {ex.printStackTrace();}
		finally {try {if(br!=null) br.close();}
			catch(Exception ex) {ex.printStackTrace();}
		}
		return wordMap;
	}
	public List<Entry<String, Integer>> sortByValue(Map<String,Integer> wordMap){
		Set<Entry<String,Integer>> set=wordMap.entrySet();
		List<Entry<String, Integer>> list=new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}
	
	public static void main(String[] args) {
		MaxDuplicateWordCount mdc=new MaxDuplicateWordCount();
		Map<String, Integer> wordMap=mdc.getWordCount("C:/Users/ashutosh_kumar/SW/eclipse-workspace/Ex1/Java 9 Features.txt");
		List<Entry<String,Integer>> list=mdc.sortByValue(wordMap);
		for(Map.Entry<String, Integer> entry:list) {
			System.out.println(entry.getKey()+"   :   "+entry.getValue());
		}
	}
	
}
