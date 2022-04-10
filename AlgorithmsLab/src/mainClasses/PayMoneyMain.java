package mainClasses;

import java.util.Scanner;

import controller.PayMoney;

public class PayMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		
		System.out.println("Enter the values of array");
		
		for(int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int nTargets = sc.nextInt();
		
		PayMoney pm = new PayMoney();
		
		for(int n = 0; n < nTargets; n++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			pm.isTargetPresent(transactions, target);
		}
		sc.close();
	}

}
