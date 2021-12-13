package main;

public class BulkDiscount extends DiscountPolicy{

	public BulkDiscount ( double itemCount, double percent ) {
	
		double cost = 2.95; 
		if ( itemCount >= 10 ) {
			percentOff = percent; 
			
			computeDiscount( itemCount , cost ); 
		}
		
	}
}
