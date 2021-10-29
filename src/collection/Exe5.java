package collection;
/*
 * create a method which accepts an array of integer elements and return the second smallest element in the array
 */


	import java.util.Collections;
	import java.util.List;
	import java.util.ArrayList;

	public class Exe5
	{

	       public int getSecondSmallest(int[] arr)
	       {
	              List<Integer> intList = new ArrayList<Integer>();
	              for(int i: arr)
	              {
	                     intList.add(i);
	              }
	              Collections.sort(intList);
	              return intList.get(1);
	       }
	       public static void main(String[] args)
	       {
	    	   Exe5  p = new Exe5();
	              int arr[] = {1,2,3,4,5,6,7};
	              int i = p.getSecondSmallest(arr);
	              System.out.println(i);
	       }

	}