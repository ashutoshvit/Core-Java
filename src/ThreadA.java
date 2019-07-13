
public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b1 = new ThreadB();
		ThreadB b2=new ThreadB();
		ThreadB b3=new ThreadB();
		b1.start();
		b2.start();
		b3.start();
		
		
		synchronized(b1) {
			System.out.println("Main class is trying to call wait method");
			b1.wait(100);
			System.out.println("main thread get notification =     ");
			System.out.println(b1.total);
		}
		
		synchronized(b2) {
			System.out.println("Main class is trying to call wait method");
			b2.wait(100);
			System.out.println("main thread get notification =     ");
			System.out.println(b2.total);
		}
		
		synchronized(b3) {
			System.out.println("Main class is trying to call wait method");
			b3.wait(10000);
			System.out.println("main thread get notification =     ");
			System.out.println(b3.total);
		}

	}

}

class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("Child start Notification");
			for(int i=0;i<=100;i++) {
				total=total+1;
				
			}
			System.out.println("Child class trying to give notifivation");
			this.notify();
		}
	}
}