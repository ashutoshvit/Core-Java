package InterviewPrograms;

public class ReserverAString {
	String reverse="";
	public String reverseString(String str) {
		if(str.length()==1) {
			return str;
		}
		else {
			reverse+=str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
	}
	public static void main(String[] args) {
		ReserverAString ra=new ReserverAString();
		System.out.println(ra.reverseString("Ashutosh"));
	}

}
