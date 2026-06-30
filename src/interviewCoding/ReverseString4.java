package interviewCoding;

import java.util.Stack;

public class ReverseString4 {

	
	//Using  Stack
	
	public static void main(String[] args) {
		
		String str = "SpringBoot";
		
		Stack<Character> stack = new Stack<>();
		
		for (char ch : str.toCharArray()) {
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
