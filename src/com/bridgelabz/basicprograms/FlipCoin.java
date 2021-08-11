package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class FlipCoin {
	private static final double Random_check = 0.5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many times to flip coin: ");
		int NoOfFlips = scanner.nextInt();
		int heads=0;
		int tails=0;
		
		for (int i=0; i<NoOfFlips; i++) {
			double randNum = Math.random();
			if (randNum<Random_check) {
				heads++;
			}
			else {
				tails++;
			}
		}
		double headsPercentage = (heads*100)/NoOfFlips;
		double tailsPercentage = (tails*100)/NoOfFlips;
		System.out.println(+headsPercentage);
		System.out.println(+tailsPercentage);
		scanner.close();
	}
}
