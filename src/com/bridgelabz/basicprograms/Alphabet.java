package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Alphabet: ");
		char character = sc.next().charAt(0);
		character = (Character.toLowerCase(character));
		
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
            System.out.println(character + " is vowel");
        else
            System.out.println(character + " is consonant");
	}

}