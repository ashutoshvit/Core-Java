package CollectionsEx;

import java.util.PriorityQueue;
public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		System.out.println(p.poll());
		for(int i=0;i<100;i++){
			p.offer(i);
		}
		
		System.out.println(p);
		System.out.println(p.poll());

	}

}
