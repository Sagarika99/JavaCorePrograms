package com.bridgelabz.ObjectOrientedPrograms;

public class Inventory {
	
	public String grainName;
	public int weightOfGrain;
	public double PricePerkg;
	
	public Inventory(String grainName, int weightOfGrain, double pricePerkg) {
		this.grainName = grainName;
		this.weightOfGrain = weightOfGrain;
		this.PricePerkg = pricePerkg;
	}

	@Override
	public String toString() {
		return "Price for grain "+grainName+" weight of grain is "+weightOfGrain+" price per KG is "+PricePerkg+" in the inventory ";
	}
}
