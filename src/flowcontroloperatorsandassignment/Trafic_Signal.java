package flowcontroloperatorsandassignment;
/*
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console.
 * Initially there is no message shown.
 */

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