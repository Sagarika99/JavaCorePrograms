package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Harmonic Value of N: ");
		int HarmonicN = sc.nextInt();
		double result = 0.0;
		
		while(HarmonicN != 0) {
			result = result + (double)1/HarmonicN;
			System.out.println(result);
			HarmonicN--;
		}
			
		
	}

}

//for (int i=1; i<=HarmonicN; i++) {
	//result = result + (double)1/i;
	//System.out.println(+result);
//}