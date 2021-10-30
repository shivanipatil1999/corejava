package lambdaexpressionandstreamapi;
/*
 * write a method that uses Lambda expression to accept username and password and return true or false 
 * hint use any custom value for username and password for authentication
 */

import java.util.Scanner;

@FunctionalInterface
interface UsernameAndPassword
{
	boolean validation(String username, String password);
}
public class Exe3 {

	public static void main(String[] args)
	{

		Scanner scn= new Scanner(System.in);

		UsernameAndPassword up= (username, password) -> 
			username.equals("Shivani9192") && password.equals("HOME@9192");

		System.out.println("Enter User Name; ");
		String username= scn.next();

		System.out.println();
		System.out.println("Enter Password: ");
		String password= scn.next();

		System.out.println();
		System.out.println("Status: "+ up.validation(username, password));

		scn.close();
	}

}