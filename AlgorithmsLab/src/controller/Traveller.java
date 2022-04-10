package controller;

import java.util.Arrays;
import java.util.Random;

//implementing both merge sort and quicksort sorting methods for practise

public class Traveller {
    void mergeSort(int array[], int l, int r){
        if (l < r){
            int m = (l + r) / 2;
 
            mergeSort(array, l, m);
            mergeSort(array , m + 1, r);
            merge(array, l, m, r);
        }
    }
	
	void merge(int array[], int l, int m, int r) {
        int nLeft = m - l + 1;
        int nRight = r - m;
        int left[] = new int [nLeft];
        int right[] = new int [nRight];
 
        for (int i=0; i<nLeft; ++i) {
            left[i] = array[l + i];
        }
        
        for (int j = 0; j < nRight; ++j) {
            right[j] = array[m + 1+ j];
        }
 
       int i = 0, j = 0, k = l;
        while (i < nLeft && j < nRight){
            if (left[i] > right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nLeft){
            array[k] = left[i];
            i++;
            k++;
        }
        
        while (j < nRight){
            array[k] = right[j];
            j++;
            k++;
        }
    }
	
	private int[] sortDenominations(int[] denominations) {
		
//		mergeSort(denominations,0,denominations.length - 1);
		quickSort(denominations,0,denominations.length - 1);
		return denominations;
	}
	
	   int partition(int array[], int low, int high){
	        int pivot = array[high]; 
//		   int pivot = new Random().nextInt(array.length - 1);
	        int i = low - 1;
	        for (int j = low; j < high; j++){
	            if (array[j] > pivot){
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	  
	        int temp = array[i+1];
	        array[i+1] = array[high];
	        array[high] = temp;
	  
	        return i+1;
	    }
	 
	    void quickSort(int array[], int low, int high){
	        if (low < high){
	            int pi = partition(array, low, high);
	  
	            quickSort(array, low, pi-1);
	            quickSort(array, pi+1, high);
	        }
	    }

	public void transacts(int[] denominations, int amount) {
		sortDenominations(denominations);
//		System.out.println(Arrays.toString(denominations));
		
		int divisor;
		System.out.println("Your payment approach in order to give min no of notes will be: ");
		
		for(int i = 0 ; i < denominations.length; i++) {
			if(amount >= denominations[i] ) {
				divisor = amount / denominations[i];
				System.out.println(denominations[i] + ":" + divisor);
				amount -= divisor * denominations[i];}
		}
	}
}