import java.util.Scanner; 
public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		
		System.out.print("Write a number between 1 and 7. \n"); 
		int num = input.nextInt(); 
		
		//creating a switch statement to print the days of the week 
		switch (num) {
			case 1: 
				System.out.print("Your Number: " + num + "\n Day of the week: Monday. ");
				break; 
			case 2: 
				System.out.print("Your Number: " + num + "\n Day of the week: Tuesday. ");
				break; 
			case 3: 
				System.out.print("Your Number: " + num + "\n Day of the week: Wednesday. ");
				break; 
			case 4: 
				System.out.print("Your Number: " + num + "\n Day of the week: Thursday. ");
				break; 
			case 5: 
				System.out.print("Your Number: " + num + "\n Day of the week: Friday. ");
				break; 
			case 6: 
				System.out.print("Your Number: " + num + "\n Day of the week: Saturday. ");
				break; 
			case 7: 
				System.out.print("Your Number: " + num + "\n Day of the week: Sunday. ");
				break; 
				
		}
			
	}

}
