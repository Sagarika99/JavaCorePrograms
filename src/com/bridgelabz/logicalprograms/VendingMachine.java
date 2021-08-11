package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		int notes[] = {1000,500,100,50,20,10,5,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int money = sc.nextInt();
		int count[] = new int[notes.length];
		int i=0;

		while(money!=0) {
			if (money>=notes[i]) {
				int noOfNodes = money/notes[i];
				money = money - noOfNodes*notes[i];
				count[i] = noOfNodes;
			}
			i++;
			
		}	
		for(int j=0; j<notes.length; j++) {
			if(count[j]!=0) {
				System.out.println(notes[j]+" : "+count[j]);
			}
		}
		
		
	}
}

