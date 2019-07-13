package dataStructure;
/*Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. For example, given:
//start = "hit" end = "cog" dict = ["hot","dot","dog","lot","log"]
//One shortest transformation is "hit" ->"hot" ->"dot" ->"dog" ->"cog", the program should return its length 5.
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordLoader {

	String word;
	int numSteps;
	WordLoader(String word, int numSteps) {
		this.word=word;
		this.numSteps=numSteps;
	}
}
public class WordLoaderSolution{
	public int ladderLength(String beginWord, String endWord,Set<String> wordDict) {
		LinkedList<WordLoader> queue=new LinkedList<WordLoader>();
		queue.add(new WordLoader(beginWord,1));
		wordDict.add(endWord);
		
		while(!queue.isEmpty()) {
			WordLoader top=queue.remove();
			String word=top.word;
			
			if(word.equals(endWord)) {
				return top.numSteps;
			}
			char[] arr=word.toCharArray();
			for(int i=0;i<arr.length;i++) {
				for(char c='a';c<='z';c++) {
					char temp=arr[i];
					if(arr[i]!=c) {
						arr[i]=c;
					}
					String newWord=new String(arr);
					if(wordDict.contains(newWord)) {
						queue.add(new WordLoader(newWord,top.numSteps+1));
					}
					arr[i]=temp;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String start="hit";
		String end="cog";
		String[] arr={"hot","dot","dog","lot","log"};
		
		Set<String> dict=new HashSet<>(Arrays.asList(arr)) ;
		//dict= {"hot","dot","dog","lot","log"};
		WordLoaderSolution wls=new WordLoaderSolution();
		System.out.println(wls.ladderLength(start, end, dict));
	}

}
