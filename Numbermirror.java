Number mirror - Negative integer
Let us now solve some programming problems. Note that

In the IDE - the text after '//' is comments which doesn't affect the code and will give you hints about what you need to do
The Solution tab also has '//' - comments which give you helpful information
Task
Write a program in the IDE which does the following

Accepts the count of test cases - t - in the 1st line
The only line of each test case consists of an integer N
You need to generate the following output - Change the sign of N.
That is, if the input is 4, output -4. If the input is -5, output 5.
Sample 1:
Input
Output
5
1
2
3
-4
-5
-1
-2
-3
4
5
OUTPUT :-

// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            // accept 1 integer on the 1st line of each test case
            int n = read.nextInt();
            // output the negative integer - i.e. (-N)
            System.out.println(-n);
        }
	}
}
