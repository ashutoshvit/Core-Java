//How to reverse Singly Linked List?

package Thread_java8;

import java.util.regex.Pattern;
public class ReverseStringEx {

	static String ReverseString(String str) {
		// Specifying the pattern to be searched
		Pattern ptr= Pattern.compile("\\s");
		//Saperate via spaces
		String[] temp=ptr.split(str);
		String result="";
		
		for (int i=0;i < temp.length;i++) {
			if(i == temp.length - 1)
			{
				result=temp[i]+result;
				
			}
			else {
				result=" "+temp[i]+result;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String s1="I Love JAVA";
		System.out.println(ReverseString(s1));

	}

}
