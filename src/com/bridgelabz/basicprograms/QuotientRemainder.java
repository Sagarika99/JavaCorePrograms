package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the dividend and divisor: ");
		
		int Dividend = sc.nextInt();
		int Divisor = sc.nextInt();
		
		int Quotient = Dividend / Divisor;
		int Remainder = Dividend % Divisor;
		
		System.out.println("The Quotient of "+Dividend+" and "+Divisor+ " is :" +Quotient);
		System.out.println("The Remainder of "+Dividend+" and "+Divisor+ " is :" +Remainder);
		
	}
}
