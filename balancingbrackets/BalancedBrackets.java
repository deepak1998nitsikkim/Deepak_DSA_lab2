// Java program for checking balanced brackets

package com.greatlearning.balancingbrackets;

import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr) {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();

		// Traversing the Expression
		for (char x : expr.toCharArray()) {

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			default:
				System.out.println("INVALID CHARACTER");
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}
}
