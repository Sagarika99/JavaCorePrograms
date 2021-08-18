package com.bridgelabz.ObjectOrientedPrograms;

public class Stock {
	
	public String StockName;
	public int numOfShares;
	public int sharePrice;
	public int totalvalue;
	
	
	public Stock(String StockName, int numOfShares, int sharePrice) {
		this.StockName = StockName;
		this.numOfShares = numOfShares;
		this.sharePrice = sharePrice;
	}
	
	@Override
	public String toString() {
		return "Stocks [StockName=" + StockName + ", numOfShares=" + numOfShares + ", sharePrice=" + sharePrice + "]";
	}

}
