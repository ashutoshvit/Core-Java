package dataStructure;

import java.util.PriorityQueue;

public class KthLargest_Heap {
	public int findKth(int[] num,int k) {
	PriorityQueue<Integer> queue=new PriorityQueue<>();
	for(int i:num) {
		queue.offer(i);
		if(queue.size()>k) {
			queue.poll();
		}
	}
	return queue.peek();
	}

	public static void main(String[] args) {
		KthLargest kth=new KthLargest();
		int[] num= {3,2,1,5,6,7};
		int k=3;
		
		System.out.println(kth.findKthLargest(num, k));

	}

}
