class MyThread4 extends Thread{
	public void start() {
		super.start();
		System.out.println("Thread Started");
	}
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("Child Thread");
		}
	}
}
public class ThreadEx4 {
	public static void main(String... args)
	{
		MyThread4 t= new MyThread4();
		t.start();
		for(int i=0;i<100;i++) {
		System.out.println("Main Thread");
	}
	}

}
