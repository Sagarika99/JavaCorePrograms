package com.bridgelabz.ObjectOrientedPrograms;
import java.util.Scanner;

public class InventoryManager {
public Inventory[] inventory;
public int noOfgrains = 0;
	
	public void addGrains() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<inventory.length; i++) {
			System.out.println("Enter grain name : ");
			String grain = sc.next();
			System.out.println("Enter weight of grain ");
			int weight = sc.nextInt();
			System.out.println("Enter price per kg:");
			int price = sc.nextInt();
			inventory[noOfgrains] = new Inventory(grain,weight,price);
			noOfgrains++;
			System.out.println("\n"+inventory[i]);
		}
	}
	
	public InventoryManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many grains you want to add? ");
		int noOfgrains = sc.nextInt();
		inventory = new Inventory[noOfgrains];
		for (int i=0; i<noOfgrains; i++) {
			addGrains();
		}
	}
		
	public void CalculatePrice() {
		for (int i=0; i<inventory.length; i++) {
			System.out.println("Grain "+inventory[i].grainName+ " Total Cost of Grain "+inventory[i].weightOfGrain*inventory[i].PricePerkg);
		}
	}
				
	public static void main(String[] args) {
		InventoryManager inventorydata = new InventoryManager();
		inventorydata.CalculatePrice();
	}
}
