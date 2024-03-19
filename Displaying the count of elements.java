To find the size of an array we use the length property.

String[] chocolate = {"Ferrero Rocher", "Alpenliebe", "Cadbury"};
System.out.println(chocolate.length);

Output:
3 
Task
Write a program which does the following

Create an int array containing the elements - 10, 20, 30, 40, 50, 60
Compile and output to the console the accurate count of the number of integer elements in the given array.

  OUTPUT :
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] abc = {10, 20, 30, 40, 50, 60};
		System.out.println(abc.length);

	}
}
