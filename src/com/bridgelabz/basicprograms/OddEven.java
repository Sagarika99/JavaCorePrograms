package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("The number " +num+ " is an even number");
		}
		else {
			System.out.println("The number " +num+ " is an odd number");
		}
	}

}
