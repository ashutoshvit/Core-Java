package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval{
	int start;
	int end;
	Interval(){
		start=0;
		end=0;
	}
	Interval(int start,int end){

		this.start=start;
		this.end=end;
	}
}
public class MergeIntervals {
	ArrayList<Interval> merge(ArrayList<Interval> intervals){
		if(intervals==null||intervals.size()<=1) {
			return intervals;
		}
		// sort intervals by using self-defined Comparator
		Collections.sort(intervals,new IntervalComparator());
		ArrayList<Interval> result=new ArrayList<Interval>();
		
		Interval pre=intervals.get(0);
		for(int i=0;i<intervals.size();i++) {
			Interval curr=intervals.get(i);
			if(pre.end>=curr.start) {
				//merge Case
				Interval merged= new Interval(pre.start,Math.max(pre.end, curr.end));
				pre =merged;
			}
			else {
				result.add(pre);
				pre=curr;
			}
		}
		result.add(pre);
		return result;
	}
	public static void main(String args[]) throws Exception {
		ArrayList<Interval> arr=new ArrayList<Interval>();
		arr.add(new Interval(1,3));
		arr.add(new Interval(2,6));
		arr.add(new Interval(8,10));
		arr.add(new Interval(15,18));
		MergeIntervals mi=new MergeIntervals();
		System.out.println(mi.merge(arr));
	}
	
}
class IntervalComparator implements Comparator<Interval>{

	@Override
	public int compare(Interval i1, Interval i2) {
		
		return i1.start-i2.end;
	}
	
}
