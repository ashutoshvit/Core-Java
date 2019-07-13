package CollectionsEx;

public class LambdaEx2 {

	
	public static void main(String[] args) {
	
		//Runnable without Lambda
		Runnable r1= new Runnable() {
			@Override
			public void run() {
				System.out.println("MY Runnable");
			}
		};
		
		//Runnable with Lambda
		Runnable r2=()->System.out.println("My Runnable with lambda");
		
		new Thread(r1).start();
		new Thread(r2).start();

	}

}
