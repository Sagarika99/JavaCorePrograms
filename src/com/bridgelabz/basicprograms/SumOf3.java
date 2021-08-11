package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class SumOf3 {
	public static void main(String[] args) {
		int arr[] = new int[7];
		arr[0] = 1;
		arr[1] = -3;
		arr[2] = 2;
		arr[3] = 0;
		arr[4] = 5;
		arr[5] = -6;
		arr[6] = 1;
		
		for (int a=0; a<arr.length; a++) {
			System.out.print(" " +arr[a]);
			System.out.println();
		}
		System.out.println("the triplets are:");
		for (int i=0; i<=(arr.length)-2; i++) {
			for (int j=i+1; j<=(arr.length)-1; j++) {
				for (int k=j+1; k<arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {		 
	                    System.out.print(arr[i]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[j]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[k]); 
	                    System.out.println(" ");
					}
				}
			}
		}
	}		
}


