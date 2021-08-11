package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int num = sc.nextInt();
		
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum = sum + i;
			}
		}
		if(sum == num){
			System.out.println("it is a Perfect number");
		}
		else{
			System.out.println("it is not a Perfect number");
		}    
	}
}
