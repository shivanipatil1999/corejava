package exceptionhandling;
/*
 * validate the age of a person and display proper message by using user defined exception age of a person should be above 15
 */
import java.util.Scanner;

public class AgeExp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age :: ");
		int age = s.nextInt();

		try {
			if (age < 15)
				throw new InvalidAgeException("Invalid age, Age should be less than 15");
			else
				System.out.println("Valid age");
		} catch (InvalidAgeException a) {
			System.out.println(a);
		}
	}
}
