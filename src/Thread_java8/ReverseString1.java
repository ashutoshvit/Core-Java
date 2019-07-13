//Program to Reverse a String
package Thread_java8;

public class ReverseString1 {
	
	String reverseString="";
	public String ReverseString(String str) {
		if (str.length()==0) {
			return str;
		}
		else {
			reverseString+=str.charAt(str.length()-1)+ReverseString(str.substring(0, str.length()-1));
		}
		
		return reverseString;
	}
	

	public static void main(String[] args) {
	
		ReverseString1 rs=new ReverseString1();
		System.out.println("Result="+rs.ReverseString("Ashutosh"));
		

	}

}
