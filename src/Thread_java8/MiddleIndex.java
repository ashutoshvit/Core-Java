//Find out middle index where sum of both ends are equal.
package Thread_java8;

public class MiddleIndex {
	public static int findMiddleNumber(int[] num) throws Exception{
		int endIndex=num.length-1;
		int startIndex=0;
		int sumLeft=0;
		int sumRight=0;
		while (true) {
			if(sumLeft>sumRight) {
				sumRight+=num[endIndex--];
			}else {sumLeft+=num[startIndex++];}
			if(startIndex>endIndex) {
				if(sumLeft==sumRight) {
					break;
				}else {
					throw new Exception("Please pass proper array to insert in to values");
					
				}
			}
		}
		return endIndex;
	}

	public static void main(String[] args) {
		int[] num= {1,2,3,5,4,5,6,7,7};
		try {
			System.out.println("Starting from index 0, adding numbers till index "
                    + findMiddleNumber(num) + " and");
				System.out.println("adding rest of the numbers can be equal");

		}
		catch (Exception ex) {
    System.out.println(ex.getMessage());}
	}
}
