package dataStructure;

import java.util.Stack;

public class AcceptedApproce_ArithmeticExpression {

	public int evalRPN(String[] tokens) {
		int returnValue=0;
		String operator="+-*/";
		Stack<String> stack=new Stack<String>();
		for (String t : tokens) {
			if(!operator.contains(t)) {
				stack.push(t);
			}
			else {
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
					break;
				}
				
			}
		}
		returnValue=Integer.valueOf(stack.pop());
		return returnValue;
	}
	public static void main(String[] args) {
		String[] tokens=new String[] {"2", "1", "+", "3", "*"};
		AcceptedApproce_ArithmeticExpression aa=new AcceptedApproce_ArithmeticExpression();
		System.out.println(aa.evalRPN(tokens));

	}

}
