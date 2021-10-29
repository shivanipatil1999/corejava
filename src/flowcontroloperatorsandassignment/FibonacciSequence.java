package flowcontroloperatorsandassignment;
/*
 * The Fibonacci sequence is defined by the following rule.
 * The first 2 values in the sequence are 1, 1.
 * Every subsequent value is the sum of the 2 values preceding it.
 * Write a Java program that uses both recursive functions to print the nth value of the Fibonacci sequence?
 */

import java.util.Scanner;

public class FibonacciSequence 
{

	public static void main(String args[])
	{
		int n = 0, n1 = 0, n2 = 1, n3;
		// int temp=0,temp2=0,temp3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input: ");
		n = sc.nextInt();
		System.out.println(n1 + "\n" + n2 + "\n");
		// int counter = 0;
		for (int i = 2; i <= n; ++i) 
		{
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}
}
