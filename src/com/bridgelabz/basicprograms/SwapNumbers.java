package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers to be swapped: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		
		System.out.println("Before swapping numbers are " +a+ " and " +b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping numbers are " +a+ " and " +b);
		
		
		
		
	}
	

}
