
import java.util.Stack;

public class BalancedParenthesis {
	
	public static void main (String args[]) {
		
		String input = "{[]}()[{}]";
		
		boolean result = isParenthesisBalanced(input);
		if(result) {
			System.out.println("The entered boolean string has balanced brackets");
		} else {
			System.out.println("The entered strings do not contain balanced brackets");
		}
	}

	private static boolean isParenthesisBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();
		char[] inputArray = input.toCharArray();
		for (int i = 0; i< inputArray.length; i++) {
			
			if(inputArray[i] == '(' || inputArray[i] == '[' || inputArray[i] == '{' ) {
				stack.push(inputArray[i]);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			switch(inputArray[i]) {
			
			case ')':
			char c = stack.pop();
			if(c== ']' || c == '}') {
				return false;
			}
			break;
			
		case ']':
			char c1 = stack.pop();
			if(c1== ']' || c1 == '}') {
				return false;
			}
			break;
			
	case '}':
		char c11 = stack.pop();
		if(c11== ']' || c11 == '}') {
			return false;
		}
		break;
		
		}
		}
		if (stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
		}
}
