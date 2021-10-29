/*
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */

package flowcontroloperatorsandassignment;

import java.util.Scanner;

public class Sum_of_Cube {
	int n = 0, sum = 0, cube = 0;

	public int Cube() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input: ");
		n = sc.nextInt(); 
		int counter = 0;
		for (int i = 0; i <= n; i++) {

			cube = i * i * i;
			sum += cube;

		}
		System.out.println(sum);
		return 0;
	}

	public static void main(String args[]) {
		Sum_of_Cube SOC = new Sum_of_Cube();
		SOC.Cube();

	}

}