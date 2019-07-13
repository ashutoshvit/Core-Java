package Thread_java8;

public class DeadLockEx {
	
	String s1="Java";
	String s2="Love";
	Thread thr1= new Thread("My Thread 1") {
		public void run() {
			while(true) {
				synchronized(s1) {
					synchronized(s2) {
						System.out.println(s1+s2);
					}
				}
			}
		}
	};
	
	Thread thr2= new Thread("My Thread 2") {
		public void run() {
			while(true) {
				synchronized(s2) {
					synchronized(s1) {
						System.out.println(s1+s2);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadLockEx dl=new DeadLockEx();
		dl.thr1.start();
		dl.thr2.start();

	}

}
