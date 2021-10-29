package stringsandparsing;
/*
 * creat a method that accepts a string and checks if it is positive string. A string 
 * is considered a positive string, if on moving from left to right each character 
 * in the string comes after the previous characters in an alphabetical 
 * order 
 * for example ANT is a positive string 
 * (Since T comes after N and N comes A) 
 * A the method should return true if the entered string is positive
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exp8
{
	public static void main(String[] args)
	{
		
		Scanner scn= new Scanner(System.in);
	
		//ask to user to give input
		
		System.out.println("Enter a string to check it is positive string or not: ");
		String str= scn.nextLine();
		
		//check whether the string is a positive string or not
		
		if(isAlphabaticOrder(str))
		{
			System.out.println(str+" is a positive string");
		}
		else
		{
			System.out.println(str+" is not a positive string");
		}
		
	}
	
	// Method that checks whether the string is in alphabetical order or not
	
	public static boolean isAlphabaticOrder(String str) 
	{
		
		// length of the string
		
		int length= str.length();
		
		//Create a char array of length as string
		
		char chars[]= new char[length];
		
		//assign the string to char array
		
		for(int i=0; i<length; i++) 
		{
			chars[i]= str.charAt(i);
		}
		
		//sort the char array
		
		Arrays.sort(chars);
		
		//check if the char array is equal to string or not
		
		for(int i= 0; i<length; i++)
		{
			if(chars[i]!=str.charAt(i))
				return false;
		}
		return true;
	}
}
