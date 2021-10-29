package flowcontroloperatorsandassignment;
/*
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 */

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		// Java program that prompts the user for an integer and then prints out all the
		// prime numbers up to that Integer?
		int number, n, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number from User:");
		number = sc.nextInt();

		for (int i = 0; i <= number; i++) 
		{
			res = i % 2;
			if (res == 0)
			{
				System.out.println(i + "  " + "is not  prime number");
				// System.out.println();
				// System.out.println(i);

			}

			else
			{
				System.out.println(i + "  " + "is prime number");

			}
		}

	}

}
