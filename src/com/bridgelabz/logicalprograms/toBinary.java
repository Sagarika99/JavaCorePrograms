package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class toBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal number: ");
		int decNum = sc.nextInt();
		
		String binary = "";
		while (decNum != 0) {
			binary = String.valueOf(decNum%2) + binary;
			decNum /= 2;
		}
		
		if (binary.length()%8 != 0) {
			int temp = 8 - binary.length()%8;
			for (int i=0; i<temp; i++) {
				binary = "0" + binary;
			}
		}
		
		System.out.println(binary);

	}
}
