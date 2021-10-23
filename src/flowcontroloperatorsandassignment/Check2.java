package flowcontroloperatorsandassignment;

import java.util.Scanner;

public class Check2
{
	 public static void main(String args[])
	 {
	int[] numArray = new int[20];
	int number=0;
	numArray[0]=number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number from User:");
	number = sc.nextInt();
	for( int x=0; x < numArray.length; x++)
	{            
	    if (numArray[x] < numArray[x+1])
	    {
	        System.out.println(number+" "+" is Increasing number");
	    } 
	    else
	    {
	        System.out.println(number+" "+" is Not Increasing number");
	    }
	     
	
}
}
}