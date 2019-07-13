package Thread_java8;
import java.util.*;
public class ThreadEx1 {

	public static void main(String[] args) {
		(new Thread(new Worker1())).start();
		new Worker2();
		new Thread(new Runnable() {
			public void run() {
				ToDo.work(2,5);
			}
		}).start();
		
		(new Thread(()->ToDo.work(2,5))).start();
		ToDo.work(5,10);

	}

}
class Worker1 implements Runnable
{
	public void run()
	{
		ToDo.work(2,5);
	}
}

class Worker2 extends Thread{
	public Worker2() {
		start();
	}
	public void run() {
		ToDo.work(2,5);
	}
}

class ToDo{
	public static Random randam= new Random();
	public static void work(int a,int b) {
		print("Started");
		for(int i=0,n=randam.nextInt(b-a)+a;i<n;i++) {
			print("Working");
			work();
		}
		print("terminated");
	}
	public static void print(String text) {
		long id=Thread.currentThread().getId();
		System.out.println("["+id+"]"+text);
	}
	private static void work() {
		double y;
		for(int i=0;i<100000000000L;i++) y=Math.cos(Math.sqrt(randam.nextDouble()));
	}
}
