package InterviewPrograms;

public class SingletonTest {

	public static SingletonTest myObj;
	static {
		myObj=new SingletonTest();
	}
	private SingletonTest() {}
	public static SingletonTest getInstance() {
		return myObj;
	}
	public void testme() {
		System.out.println("Test is working");
	}
	public static void main(String[] args) {
		SingletonTest st=getInstance();
		st.testme();
	}
}
