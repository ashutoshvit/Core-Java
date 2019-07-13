package dataStructure;

import java.util.PriorityQueue;

public class HeapKthLargest {

	public int findKth(int[] num,int k) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for (Integer i : num) {
			q.offer(i);
			if(q.size()>k) {
				q.poll();
			}
		}
		return q.peek();
	}
	public static void main(String[] args) {
		int[] num= {6,5,7,2,1,7,8,4,};
		int k=2;
		HeapKthLargest kth=new HeapKthLargest();
		System.out.println(kth.findKth(num, k));

	}

}
