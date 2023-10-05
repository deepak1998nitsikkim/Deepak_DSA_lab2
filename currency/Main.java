package com.greatlearning.lab.currency;

import java.util.*;

public class Main {
	
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of denominations:");
			int x = sc.nextInt();
			int denominations[]= new int[x];
			System.out.println("Enter the denomination values:");
			for(int i=0;i < x;i++) {
				denominations[i]=sc.nextInt();
			}
			Sorting sort = new Sorting();
			sort.sort(denominations, 0, denominations.length-1);
			
			System.out.println("Enter the payble amount:");
			int payvalue = sc.nextInt();
			
			System.out.println(" ");
			Currency curr = new Currency();
			curr.countCurrency(denominations, payvalue);
			sc.close();
	    }
}