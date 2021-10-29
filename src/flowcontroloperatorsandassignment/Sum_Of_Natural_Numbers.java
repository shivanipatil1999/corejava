package flowcontroloperatorsandassignment;
/*
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */


import java.util.Scanner;

public class Sum_Of_Natural_Numbers {

	public int calculateSum() {
		int number, n, res = 0, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number from User:");
		number = sc.nextInt();

		for (int i = 0; i <= number; i++) {

			if (i % 5 == 0 || i % 3 == 0) {
				System.out.println(i + "  " + "is divisible");
				res = res + i;
				// counter++;
			} else

			{
				System.out.println(i + "  " + "not divisible");
			}

		}
		System.out.println("Sum of digits is:" + "  " + res);
		return res;
	}

	public static void main(String args[]) {
		Sum_Of_Natural_Numbers sn = new Sum_Of_Natural_Numbers();
		sn.calculateSum();

	}
}
 