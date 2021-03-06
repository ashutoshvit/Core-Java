package dataStructure;
/** * Definition for an interval. 
 * * public class Interval 
 * { * int start; * int end;
 *  * Interval() 
 *  { start = 0; end = 0; }
 *   * Interval(int s, int e) 
 *   { start = s; end = e; } * 
 *   } */

import java.util.ArrayList;

public class InsertInterval {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newInterval){
		ArrayList<Interval> result=new ArrayList<Interval>();
		for(Interval interval:intervals) {
			if(interval.end<newInterval.start) {
				result.add(newInterval);
				
			}else if(interval.start>newInterval.end) {
				result.add(newInterval);
				newInterval=interval;
			}else if(interval.end>=newInterval.start||interval.start<=newInterval.end) {
				newInterval=new Interval(Math.min(interval.start, newInterval.start), Math.max(newInterval.end, interval.end));
			}
		}
		result.add(newInterval);
		return result;
	}
	public static void main(String args[]) {
		ArrayList<Interval> arr=new ArrayList<Interval>();
		arr.add(new Interval(1,3));
		arr.add(new Interval(6,9));
		arr.add(new Interval(8,10));
		arr.add(new Interval(15,18));
		InsertInterval i=new InsertInterval();
		System.out.println(i.insert(arr,new Interval(2,5)));
	}
	

}
