package stringsandparsing;
/*
 * create a method to accept date and print the duration in days months and years with regards to current system date
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exp9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date(dd/MM/yyyy) : ");
		
		String date = sc.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date1 = LocalDate.parse(date, formatter);
		System.out.println("Date is : " + date1);
	}
}
