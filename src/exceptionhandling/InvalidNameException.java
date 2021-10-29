package exceptionhandling;

public class InvalidNameException extends RuntimeException 
{

	public InvalidNameException(String s)
	{
		System.out.println(s);
	}
}