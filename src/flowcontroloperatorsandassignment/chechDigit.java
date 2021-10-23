package flowcontroloperatorsandassignment;

import java.util.Scanner;

public class chechDigit{
	
	public boolean increasingDigits(int input)
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number from User:");
		number = sc.nextInt();
	    // Deal with negative inputs...
	
	    if (input < 0)
	        input = -input;

	    int lastSeen = 10; // always greater than any digit
	    int current;

	    while (input > 0) {
	        current = input % 10;
	        if (lastSeen < number)
	            return false;
	        lastSeen = current;
	        input /= 10;
	    }
	    return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
