package InterviewPrograms;
//Find longest substring without repeating characters.

import java.util.HashSet;
import java.util.Set;

public class MyLongestSubstring {
	private Set<String> subStringList=new HashSet<String>();
	private int finalSubStringSize=0;
	public Set<String> getLongestSubStr(String input){
		//reset instance variable
		subStringList.clear();
		finalSubStringSize=0;
		boolean[] flag=new boolean[256];
		int j=0;
		char[] inputCharArr=input.toCharArray();
		for(int i=0;i<inputCharArr.length;i++) {
			char c=inputCharArr[i];
			if(flag[c]) {
				extractSubString(inputCharArr,j,i);
				for(int k=j;k<i;k++) {
				    if(inputCharArr[k]==c) {
				    	j=k+1;
				    	break;
				    }
				    flag[inputCharArr[k]]=false;
				}
				
			}else {
				flag[c]=true;
			}
		}
		extractSubString(inputCharArr, j, inputCharArr.length);
		return subStringList;
		
		
	}
	private String extractSubString(char[] inputCharArr, int start, int end) {
		StringBuilder sb=new StringBuilder();
		for(int i=start;i<end;i++) {
			sb.append(inputCharArr[i]);
		}
		String subStr = sb.toString();
        if(subStr.length() > finalSubStringSize){
        	finalSubStringSize = subStr.length();
            subStringList.clear();
            subStringList.add(subStr);
        } else if(subStr.length() == finalSubStringSize){
        	subStringList.add(subStr);
        }
         
        return sb.toString();
		
	}
	
	public static void main(String a[]){
        MyLongestSubstring mls = new MyLongestSubstring();
        System.out.println(mls.getLongestSubStr("java2novice"));
        System.out.println(mls.getLongestSubStr("java_language_is_sweet"));
        System.out.println(mls.getLongestSubStr("java_java_java_java"));
        System.out.println(mls.getLongestSubStr("abcabcbb"));
    }
	

}
