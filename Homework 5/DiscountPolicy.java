package main;

public abstract class DiscountPolicy {
	public double percentOff = 0.3; 
	
	public double computeDiscount ( double count, double itemCost ) {
		
		double price = itemCost * percentOff; 
		
		double fullPrice = count * itemCost; 
		double discountPrice = count * price; 
		
		double discount = fullPrice - discountPrice; 
		return discount; 
	}
}
