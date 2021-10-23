package arrays;

// Java Program to Remove Duplicate Elements 
// From the Array using extra space 

  

public class modifyArray {

  

    public static int removeduplicates(int a[], int n) 

    { 

        if (n == 0 || n == 1) { 

            return n; 

        } 

  

        // creating another array for only storing 

        // the unique elements 

        int[] temp = new int[n]; 

        int j = 0; 

  

        for (int i = 0; i < n - 1; i++) { 

            if (a[i] != a[i + 1]) { 

                temp[j++] = a[i]; 

            } 

        }
