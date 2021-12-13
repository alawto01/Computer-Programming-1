package main;

public abstract class PayCalculator {
	//payRate should be given in dollars per hour
	public double payRate; 

	public double computePay( double hours ) {
		double pay = payRate * hours; 
		return pay; 
	}
}

