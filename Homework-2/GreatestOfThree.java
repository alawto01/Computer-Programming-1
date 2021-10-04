import java.util.Scanner; 
public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//tells the user to input the first number and assigns it to an int 
		System.out.print("Input the 1st number: ");
		int num1 = input.nextInt();
		
		//tells the user to input the second number and assigns it to an int 
		System.out.print("Input the 2nd number: ");
		int num2 = input.nextInt();
		   
		//tells the user to input the third number and assigns it to an int 
		System.out.print("Input the 3rd number: ");
		int num3 = input.nextInt();
		   
		//tests to see if num1 is greater than num2 and num3
		if ((num1 > num2) && (num1 > num3)) {
			 System.out.println("The greatest: " + num1);
		};
		  
		if ((num2 > num1) && (num2 > num3)) {
		    System.out.println("The greatest: " + num2);
		};
		
		//tests to see if num3 is greater than num1 and num2
		if ((num3 > num1) && (num3 > num2))
		    System.out.println("The greatest: " + num3);
		};
	}

