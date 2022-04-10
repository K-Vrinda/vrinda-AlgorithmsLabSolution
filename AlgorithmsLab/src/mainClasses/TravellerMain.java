package mainClasses;

import java.util.Scanner;

import controller.Traveller;

public class TravellerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		System.out.println("Enter the currency denominations value");
		int[] currencyDenominations = new int[size];
		
		for(int i = 0; i< size; i++) {
			currencyDenominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		Traveller traveller = new Traveller();
		
		traveller.transacts(currencyDenominations,amount);
		
	}

}
