package InterviewPrograms;

public class CommonElementsInArr {
	 
    public static void main(String a[]) {
         
        int[] input1 = {2,7,17,19,20,45,56,159,239};
        int[] intput2 = {7,12,15,19,22,34,55,150,159};
        int index1 = 0;
        int index2 = 0;
        while(true) {
            if(index1 >= input1.length || index2 >= intput2.length) {
                break;
            }
            if(input1[index1] == intput2[index2]) {
                System.out.print(input1[index1]);
                System.out.print("  ");
                index1 += 1;
            } else if(input1[index1] < intput2[index2]) {
                index1 += 1;
            } else {
                index2 += 1;
            }
        }
         
    }
}