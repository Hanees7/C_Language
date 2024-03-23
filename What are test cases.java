In the previous problem - we wrote the program to accept 5 inputs on 5 separate lines.

What will we do if we expect 100 inputs or test cases?
What about 100,000 inputs or test cases?
Task
Let's solve a simple problem.
Write a program in the IDE which does the following

Accepts the count of test cases - T - as an integer input given in the 1st line.
This is followed by T lines - Each line contains an integer N
For each test cases, prints out the integer N to console on a separate line (our Input mirror problem)
Sample 1:
Input
Output
3
1
22
33
1
22
33
Explanation:
Since the count of test cases is 3 -> we accept 3 inputs and print 3 outputs
OUTPUT :
  // Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        
        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept an integer N in each test case
            int n = read.nextInt();
            // output the number mirror for each test case
            // "println" prints output followed with a new line.
            System.out.println(n);
        }
	}
}
