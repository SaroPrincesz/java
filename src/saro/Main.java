package saro;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
// java must be defined in a public class.


public class Main {
	
	// Javascript code addition 

	public static String balance_parenthesis(String string){
		// Initialize an empty stack to keep track of opening and closing parentheses
		Stack<Character> stack = new Stack<Character>();

		// Iterate over each character in the input string
		for(int i = 0; i < string.length(); i++){
			// If the character is an opening parenthesis, push it onto the stack
			Character c = string.charAt(i);

			if(c == '(')
				stack.push(c);
			// If the character is a closing parenthesis
			else if(c == ')')
				// If there is at least one opening parenthesis on the stack, 
				// pop the most recent one
				if(stack.size() > 0 && stack.peek() == '(')
					stack.pop();
				// Otherwise, push the closing parenthesis onto the stack
				else
					stack.push(c);
		}

		// Count the remaining unbalanced parentheses on the stack
		// and add the appropriate number of opening and closing parentheses
		// to the beginning and end of the output string to balance it.
		int closing = 0;
		int opening = 0;
		while(stack.size() > 0){
			if(stack.peek() == '(') closing++;
			else if(stack.peek() == ')')opening++;
			stack.pop();
		}


		// Count the remaining unbalanced parentheses on the stack
		// and add the appropriate number of opening and closing parentheses
		// to the beginning and end of the output string to balance it.
		String res = "";
		for(int i = 0; i < opening ; i++)
			res = res + '(';

		res = res + string;
		for(int i = 0; i < closing; i++)
			res = res + ')';

		return res;
	}
	
	public static void main(String[] args) {

		// Example usage
		String string = ")))()";
		System.out.println("Input:");
		System.out.println(string);
		String adjusted_s = balance_parenthesis(string);
		System.out.println("Balanced Parenthesis: ");
		System.out.println(adjusted_s);
	}
}

// The code is contributed by Nidhi goel.
