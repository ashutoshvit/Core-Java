package InterviewPrograms;

public class StringToNumber {
	public static int string_to_number(String str) {
		char[] ch=str.toCharArray();
		int sum=0;
		int zeroASCii=(int)'0';
		for(char c:ch) {
			int tempAscii=(int)c;
			sum=(sum*10)+(tempAscii-zeroASCii);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("\"Ashu\" == "+string_to_number("Ashu"));
        System.out.println("\"76289\" == "+string_to_number("76289"));
        System.out.println("\"90087\" == "+string_to_number("90087"));
	}

}
