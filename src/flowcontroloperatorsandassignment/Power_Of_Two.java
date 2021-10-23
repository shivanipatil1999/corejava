package flowcontroloperatorsandassignment;

import java.util.Scanner;
public class Power_Of_Two 
{
	
	
	 int n;
	
	public void powerOfTwo()
    {
	 
			
		Scanner sc = new Scanner(System.in);
	     int n= sc.nextInt();

        if (n == 0)
           //eturn false;
        	System.out.println("Not power of two");
          
        while (n != 1)
        {
            if (n % 2 != 0)
               //eturn false;
            	System.out.println("Not power of two");
            n = n / 2;
        }
        //turn true;
        System.out.println(" power of two");
    }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power_Of_Two pt = new Power_Of_Two();
		pt.powerOfTwo();
	}

}