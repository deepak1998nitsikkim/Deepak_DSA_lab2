package com.greatlearning.lab.currency;

public class Currency {

	public void countCurrency(int[] denominations, int payvalue){
		int[] countDenominations = new int[denominations.length];
       //denomination Counter
		for(int i=0;i<denominations.length;i++) {
			if(payvalue>=denominations[i]) {
				int countCurr = payvalue/denominations[i];
				payvalue= payvalue-(denominations[i]*countCurr);
				countDenominations[i]= countCurr;
				if(payvalue==0) {
					break;
				}
			}
		}
		//if amount is payble
		if(payvalue==0) {
			System.out.println("Your payment approach in order to give minimum number of notes will be:");
			for(int i=0;i<denominations.length;i++) {
				if(denominations[i]!=0) {
					System.out.println(denominations[i]+ ":"+countDenominations[i]);
				}
			}
        //if amount can not be fully paid
		} else {
			System.out.println("Exact pay value cannot be paid with highest possible denominations");

		}
	}

}