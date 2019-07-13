//Singleton Example
package Thread_java8;

public class SingletonEx {

	public static SingletonEx obj;
	static {
		obj=new SingletonEx();
	}
	private SingletonEx() {}
	
	public static SingletonEx getInstance() {
		return obj;
	}
	
	public void testme() {
		System.out.println("I am working");
	}
	
	public static void main(String[] args) {
		SingletonEx se= new SingletonEx();
		se.testme();

	}

}
