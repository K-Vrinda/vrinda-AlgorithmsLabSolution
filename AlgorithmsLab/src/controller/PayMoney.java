package controller;

public class PayMoney {
	
	public void isTargetPresent(int[] transactions, int target) {
		long sumValue = 0;
		
		for(int i = 0; i < transactions.length; i++) {
			sumValue += transactions[i];
			if(target <= sumValue) {
				System.out.println("Target achieved after " + (i+1) + " transactions");
				break;
			}
		}
		
		if(target > sumValue) {
			System.out.println("Given target is not achieved");
		}
	}
}
