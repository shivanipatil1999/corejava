package collection;
/*
 * Example 1: A school offers medals to the students of tenth based on the following criteria 
 * If(Marks>=90) : Gold 
 * If(Marks between 80 and 90) : Silver 
 * If(Marks between 70 and 80) : Bronze 
 * Note: Marks between 80 and 90 means marks>=80 and marks<90
 *  Write a function which accepts the marks of students as a Hashmap and return the details of the students 
 *  eligible for the medals along with type of medal. The input hashmap contains the student registration number
 *   as key and mark asvalue. The output hashmap should contain the student registration number as key and the medal 
 *   type as value.Method Name getStudents Method Description Generate the list of students eligible for scholarship 
 *   Argument Hashmap Return Type Hashmap Logic The method should return the details of the students eligible for the 
 *   medalsalong with the medal type.
 */

import java.util.HashMap;
import java.util.Set;

public class Exe4 {
	       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
	       {
	              HashMap<String,String> medal = new HashMap<>();
	              Set<String> set = stu.keySet();
	              for(String s:set)
	              {
	                     Integer marks = stu.get(s);
	                     if(marks>=90)
	                     {
	                           medal.put(s,"Gold");
	                     }
	                     else if(marks >=80)
	                     {
	                           medal.put(s,"Silver");
	                     }
	                     else if(marks>=70)
	                     {
	                           medal.put(s,"Bronze");
	                     }
	              }
	              return medal;
	       }
	       public static void main(String[] ar)
	       {
	              HashMap<String,Integer> stu = new HashMap<>();
	              Exe4 p = new Exe4();

	              stu.put("R123",65);
	              stu.put("R124",76);
	              stu.put("R125",89);
	              stu.put("R126",90);
	              stu.put("R127",93);
	              System.out.println(p.getStudent(stu));
	       }
	}