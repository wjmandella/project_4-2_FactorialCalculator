import java.text.NumberFormat;
import java.util.Scanner;

//The program returns the factorial of any non-negative number entered.
//For example: If you enter 5, the program will return 120 (5!).

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			
			long factorial = 1;
			System.out.print("Enter a non-negative integer less than or equal to 20: ");
			int number = sc.nextInt();
			 
			if (number < 0 || number > 20) {
				System.out.println("Invalid entry. Please try again.");
				continue;			
			} else if (number == 0) {
				factorial = 1;				
			} else {
				for (int i = number; i >=1; i--) {
					factorial *= i;
				}
			}
			NumberFormat num = NumberFormat.getNumberInstance();
			
			System.out.println("The factorial of " + number + " is " + num.format(factorial) + ".");
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();					
		}
			sc.close();
	}
}
