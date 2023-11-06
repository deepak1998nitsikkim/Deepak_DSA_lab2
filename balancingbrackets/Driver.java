package com.greatlearning.balancingbrackets;

public class Driver {

	public static void main(String[] args) {
		String expr = "([({[{()}]})])";

		// Function call
		if (BalancedBrackets.areBracketsBalanced(expr))
			System.out.println("The Brackets in expression " + expr + " are perfectly BALANCED. ");
		else
			System.out.println("The Brakests in expression " + expr + " are are NOT perfectly BALANCED. ");
	}

}
