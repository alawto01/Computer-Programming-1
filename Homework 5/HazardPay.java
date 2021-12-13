package main;

public class HazardPay extends PayCalculator{
	
	public double computePay( double hours ) {
		double pay = payRate * hours * 1.5; 
		return pay; 
	}
}
