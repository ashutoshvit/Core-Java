
public class ThreadEx3 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		t.run(5);//Over Loading of run method

	}

}

class MyThread2 extends Thread{
	public void run() {System.out.println("run()");}
	
	public void run(int i) {System.out.println("run[i]");}
}
