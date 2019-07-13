package Java_Swing;

public class ReflectionDemo {
	public static void main (String[] args) throws ClassNotFoundException {
		//1 - By using Class.forname() method 
		Class c1 = Class.forName("ReflectionDemo"); 
		System.out.println(c1);
		//2- By using getClass() method 
		ReflectionDemo refletionObj = new ReflectionDemo();
		
		Class c2 = refletionObj.getClass();
		System.out.println(c2);
		//3- By using .class 
		Class c3= ReflectionDemo.class;
		System.out.println(c3);
		}

}
