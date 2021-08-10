package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N: ");
		int Num = sc.nextInt();
		  
	      for(int i = 2; i<= Num; i++) {
	         while(Num%i == 0) {
	            System.out.println(i+" ");
	            Num = Num/i;
	         }
	      }
	}

}
