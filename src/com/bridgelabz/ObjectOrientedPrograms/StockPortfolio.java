package com.bridgelabz.ObjectOrientedPrograms;
import java.util.Scanner;

public class StockPortfolio {
	public Stock[] stocks;
	public int companyStocks = 0;
	
	public StockPortfolio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Company Stocks: ");
		int companyStocks = sc.nextInt();
		stocks = new Stock[companyStocks];
		for (int i=0; i<companyStocks; i++) {
			addStocks();
		}
		
	}
	
	public void addStocks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock name: ");
		String stockname = sc.next();
		System.out.println("Enter the no of Shares:  ");
		int shares = sc.nextInt();
		System.out.println("Enter price per kg:");
		int price = sc.nextInt();
		stocks[companyStocks] = new Stock(stockname, shares, price);
		companyStocks++;
	}
	
	public void printReport() {
		int totalvalue = 0;
		System.out.println();
		for (int i=0; i<stocks.length; i++) {
			int value = stocks[i].sharePrice*stocks[i].numOfShares;
			totalvalue += value;
			System.out.println("Stocks [StockName=" + stocks[i].StockName + ", numOfShares=" + stocks[i].numOfShares + ", sharePrice=" + stocks[i].sharePrice + "] Total cost  "+value);			
		}
		System.out.println("Total value of Stocks : "+totalvalue);
	}
	
	public static void main(String[] args) {
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.printReport();
	}

}
