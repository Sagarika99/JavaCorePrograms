package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("enter the number");		
		int num = sc.nextInt();		
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		
		for (int i=2; i<=num; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;		
		}
		
=======
		System.out.println("Enter N: ");
		int num = sc.nextInt();
		int n1=0, n2=1, n3;
		
		System.out.print(n1+" "+n2);
		
		for(int i=0; i<num; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
>>>>>>> LogicalPrograms
	}

}
