package com.bridgelabz.ObjectOrientedPrograms;

import java.util.Scanner;

public class StockAccount {
	
	public Scanner sc = new Scanner(System.in);
	public Stock[] CompanyStocks;
	public Object[] save = new Object[2];
	public int sellStocks;
	public int buyStocks;
	public String compSymbol;
		
	public void StockAccnt() {
		System.out.println("Enter the no of Company Stocks: ");
		int compStocks = sc.nextInt();
		CompanyStocks =  new Stock[compStocks];
		addCompanyDetails();
	}
		
	public void addCompanyDetails() {
		for (int i=0; i<CompanyStocks.length; i++) {
			System.out.println("Enter Company Symbol: ");
			String dummy = sc.nextLine();
			String compSymbol = sc.nextLine();
			System.out.println("Enter Total Company Share: ");
			int TotalCompStocks = sc.nextInt();
			System.out.println("Enter price per share");
	        int pricepershare= sc.nextInt();
			CompanyStocks[i] = new Stock(compSymbol, TotalCompStocks, pricepershare);
		}		
	}
	
	//void ValueOf() {
	//	for(int i=0; i<CompanyStocks.length; i++) {
	//		System.out.println("StockName=" + CompanyStocks[i].stockName + " Total cost= "+CompanyStocks[i].numOfShares*CompanyStocks[i].sharePrice);
	//	}
	//}
	
	public void buy() {
		System.out.println("Enter symbol of company whose shares you want to buy:");
		String dummy = sc.nextLine();
		String symbol = sc.nextLine();
		
		for (int i=0; i<CompanyStocks.length; i++) {			
			if(symbol.equals(CompanyStocks[i].stockName)) {
				System.out.println("how many stocks you want to buy");
				buyStocks = sc.nextInt();
				CompanyStocks[i].numOfShares -= buyStocks;
				System.out.println("To save your transactions press 1.");
				int choice = sc.nextInt();
				if (choice==1) {
					saveStocks("buy",buyStocks);
					break;
				}
				else {
					System.out.println("Your transactions are not saved");
					break;
				}
			}
		}		
	}
	
	public void sell() {
		System.out.println("Enter symbol of company whose shares you want to sell:");
		String dummy = sc.nextLine();
		String symbol = sc.nextLine();
		
		for (int i=0; i<CompanyStocks.length; i++) {			
			if(symbol.equals(CompanyStocks[i].stockName)) {
				System.out.println("how many stocks you want to sell");
				sellStocks = sc.nextInt();
				CompanyStocks[i].numOfShares += sellStocks;
				System.out.println("To save your transactions press 1.");
				int choice = sc.nextInt();
				if (choice==1) {
					saveStocks("sell",sellStocks);
					break;
				}
				else {
					System.out.println("Your transactions are not saved");
					break;
				}
			}
		}	
	}
	
	public void saveStocks(String name, int numofshares) {
		for (int i=0; i<save.length; i++) {
			if (name.equals("buy")) {
				save[i] = "buy";
				save[i+1] = buyStocks;
				System.out.println("You have saved your purchase");
			}
			else if(name.equals("sell")) {
				save[i] = {"sell",sellStocks};
				//save[i+1] = ;
				System.out.println("You have saved your selling details");
			}
			
		}
		
	}
	
	public void printReport() {
		int totalvalue = 0;
		System.out.println();
		for (int i=0; i<CompanyStocks.length; i++) {
			int value = CompanyStocks[i].sharePrice*CompanyStocks[i].numOfShares;
			totalvalue += value;
			System.out.println("Stocks [StockName=" + CompanyStocks[i].stockName + ", numOfShares=" + CompanyStocks[i].numOfShares + ", sharePrice=" + CompanyStocks[i].sharePrice + "] Total cost  "+value);			
		}
		System.out.println("Total value of Stocks : "+totalvalue);
	}
	
	public static void main(String[] args) {
		StockAccount account = new StockAccount();
		Scanner sc = new Scanner (System.in);
		int flag = 0;
		while(flag==0) {
		System.out.println("Choose option: 1. Add the stocks 2. Buy stocks report 3. Sell stocks 4. Print Report 5. Exit");
		int option = sc.nextInt();
			switch(option) {
			case 1:
				account.StockAccnt();
				break;
			case 2:
				account.buy();
				break;
			case 3:
				account.sell();
				break;
			case 4:
				account.printReport();
				break;
			case 5:
				flag = 1;
				break;
			}
		}
		
	}
}
