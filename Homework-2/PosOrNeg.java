import java.util.Scanner; 

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a new variable that allows the user to input a number 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an number to see if it is positive or negative!");
		
		//ensures that the user inputs a number
		int userNum = input.nextInt(); 
		
		//test to see if the number is positive
		if (userNum > 0) {
			System.out.print(userNum + " is Positive!");
		}
		//test to see if the number is negative
		if (userNum < 0) {
			System.out.print(userNum + " is Negative!");
		}
		//test to see if the number is 0
		/*we need to use two = because if we use just one, 
		 * it'll think we are trying to test for a boolean*/
		if (userNum == 0) {
			System.out.print(userNum + " is neither Positive nor Negative");
		}
	}

}
