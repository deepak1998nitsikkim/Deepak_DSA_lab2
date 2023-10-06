package com.greatlearning.lab.transaction;

public class Transaction {

	public int targetCheck(int transactions[],int target){

		for(int i=0;i<transactions.length;i++){
			target=target-transactions[i];
			if(target <=0) {
				return i+1;
			}
		}
		return -1;	
	}


}
