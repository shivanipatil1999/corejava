package lambdaexpressionandstreamapi;
/*
 * write a method that uses Lambda expression how to format a given string 
 * where a space is inserted between each character of string.
 *  for ex if input is "CG" than expected output is "CG" "C G"
 */

import java.util.Scanner;

@FunctionalInterface
interface StringExp
{
	String stringExpressString(String str);
}

public class Exe2 {

	public static void main(String[] args) {

		Scanner scn= new Scanner(System.in);

		StringExp str= (str1) -> {
			char[] ch= str1.toCharArray();
			String str2= "";
			for(int i= 0; i<ch.length;i++) {
				str2+= ch[i]+ " ";
			}
			return str2;
		};

		System.out.println("Enter a String: ");
		String str3= scn.next();
		System.out.println();
		System.out.println("Result: "+ str.stringExpressString(str3));

		scn.close();

	}

}