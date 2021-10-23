package flowcontroloperatorsandassignment;

import java.util.Scanner;

public class Trafic_Signal 
{

	// private static final String Red = null;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter user input: ");
		String signal = sc.next();

		final String COLOUR1 = "Red";
		final String COLOUR2 = "Yellow";
		final String COLOUR3 = "Green";
		switch (signal)
		{
		case COLOUR1:
			System.out.println("Stop");
			break;
		case COLOUR2:
			System.out.println("Ready");
			break;
		case COLOUR3:
			System.out.println("Go");
			break;
		// Default case statement
		default:
			System.out.println("Not Available");
		}

	}

}