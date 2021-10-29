package collection;
/*
 * create a method that accepts a character array and count the number of times each character is present in the array
 */

import java.io.*;
import java.util.*;
public class Exe2
{
   static void count_characters(String input_str)
   {
      HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
      char[] str_array = input_str.toCharArray();
      
      for (char c : str_array)
      {
         if (my_map.containsKey(c))
         {
            my_map.put(c, my_map.get(c) + 1);
         }
         else
         {
            my_map.put(c, 1);
         }
      } 
      
      for (Map.Entry entry : my_map.entrySet())
      {
         System.out.println(entry.getKey() + " " + entry.getValue());
      }
   }
   public static void main(String[] args)
   {
	   System.out.println("enter the characters");
	   Scanner sc =new Scanner(System.in);
      String my_str=sc.next();
      System.out.println("The occurence of every character in the string is ");
      count_characters(my_str);
   }
} 
