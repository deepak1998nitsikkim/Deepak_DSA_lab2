package com.greatlearning.lab.transaction;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		System.out.println("Enter the values of transactions");
		for(int i=0;i<size;i++){
			transactions[i]=sc.nextInt();
		}
		System.out.println("Enter the number of targets need to be checked");
		int targetSize=sc.nextInt();
		for(int i=0;i<targetSize;i++) {
			System.out.println("Enter the target value");
			int target = sc.nextInt();
			Transaction transaction = new Transaction();
			int res =  transaction.targetCheck(transactions,target);
			if(res >0) {
				System.out.println("The target can be achieved after "+ res +" transaction(s)");
			} else {
				System.out.println("The target cannot be achieved with given transactions");
			}
			System.out.println();
		}
		sc.close();
	}


}
