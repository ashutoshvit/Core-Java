package dataStructure;

import java.io.IOException;
import java.util.Stack;

//Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. 
public class Native_Approch {

	public static void main(String[] args) throws IOException {
		String[] tokens=new String[] { "2", "1", "+", "3", "*"};
		System.out.println(evalRPN(tokens));
		}

	private static int evalRPN(String[] tokens) {
		int returnValue=0;
		String operators="+-*/";
		Stack<String> stack=new Stack<String>();
		for (String t : tokens) {
			if(!operators.contains(t)) {
				stack.push(t); //push to stack if it is a number 
			}
			else {//pop numbers from stack if it is an operator 
				int a=Integer.valueOf(stack.pop());
				int b=Integer.valueOf(stack.pop());
				switch(t) {
				case "+":
					stack.push(String.valueOf(a+b));
					break;
				case "-":
					stack.push(String.valueOf(a-b));
					break;
				case "*":
					stack.push(String.valueOf(a*b));
					break;
				case "/":
					stack.push(String.valueOf(a/b));
				}
			}
		}
		returnValue=Integer.valueOf(stack.pop());
		return returnValue;
	}

}
