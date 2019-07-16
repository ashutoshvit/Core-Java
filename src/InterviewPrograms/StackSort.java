package InterviewPrograms;
// How to sort a Stack using a temporary Stack
import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<Integer> sk=new Stack<Integer>();
		sk.add(34);
		sk.add(33);
		sk.add(40);
		sk.add(38);
		sk.add(36);
		sk.add(20);
		System.out.println("Stack :"+sk);
		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!sk.isEmpty()) {
			int temp=sk.pop();
			System.out.println("Element taken out: "+temp);
			while(!tmpStack.isEmpty()&&tmpStack.peek()>temp) {
				sk.push(tmpStack.pop());
			}
			tmpStack.push(temp);
            System.out.println("input: "+sk);
            System.out.println("tmpStack: "+tmpStack);
		}

	}

}
