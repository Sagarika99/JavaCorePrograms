package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PowerOfTwo {
	public static final int Num = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power of N: ");
		int PowerValueN = sc.nextInt();
		
		if(PowerValueN < 31) {
			for (int i=0; i<=PowerValueN; i++) {
				System.out.println((int)Math.pow(Num, i));
			}
		}
		else {
			System.out.println("Print Power of N < 31");
		}
	}		
}