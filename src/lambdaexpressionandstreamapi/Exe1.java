package lambdaexpressionandstreamapi;
/*
 * write a number expression which accepts X and Y numbers and return x ```````````````raised y
 */

import java.util.Scanner;

@FunctionalInterface
interface Power{
	float pow(int x, int y);
}

public class Exe1{

	public static void main(String[] args) {

		Power p= (a,b) -> 
		{
			int result=1;
			for(int i= 0; i<=b; i++)
				result*=a;
			return result;
		};
		Scanner scn= new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x= scn.nextInt();
		System.out.println("Enter power: ");
		int y= scn.nextInt();

		if(y==0)
			System.out.println(x+" to the power "+y+" is: "+x);
		else if (y>0) 
		{
			System.out.println(x+" to the power "+y+" is: "+p.pow(x,y));
		}
		else 
		{
			System.out.println("Please enter a positive power.");
		}

		scn.close();

	}

}