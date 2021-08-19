package com.bridgelabz.ObjectOrientedPrograms;

public class Stock {
	
	public String stockName;
	public int numOfShares;
	public int sharePrice;
	public int totalvalue;
	
	
	public Stock(String stockName, int numOfShares, int sharePrice) {
		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.sharePrice = sharePrice;
	}
	
	@Override
	public String toString() {
		return "Stocks [StockName=" + stockName + ", numOfShares=" + numOfShares + ", sharePrice=" + sharePrice + "]";
	}

}
