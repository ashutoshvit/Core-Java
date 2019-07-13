package InterviewPrograms;

public class BubbleSortEx {
	public static void bubble_Sort(int array[]) {
		int n=array.length;
		int k;
		for(int m=n;m>0;m--) {
			for(int i=0;i<n-1;i++) {
				k=i+1;
				if(array[i]>array[k]) {
					swapNumber(i,k,array);
				}
			}
			printNumber(array);
		}
	}

	private static void printNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println("\n");
		
	}

	private static void swapNumber(int i, int j, int[] array) {
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_Sort(input);

	}

}
