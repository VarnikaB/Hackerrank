/*
Input Format

The first line contains an integer that you must sum with i.
The second line contains a double that you must sum with d.
The third line contains a string that you must concatenate with s.

Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place) on the second line, and then the two concatenated strings on the third line.


*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int n = scan.nextInt();
        double db = scan.nextDouble();
        String st = scan.nextLine();
        st = scan.nextLine(); 
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(n+i);
        System.out.println(d+db);
        System.out.println(s+st);
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}