package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class LargestOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("largest Number is: "+a);
		}
		else if (b>a && b>c) {
			System.out.println("largest Number is: "+b);
		}
		else {
			System.out.println("largest Number is: "+c);
		}
	}

}
