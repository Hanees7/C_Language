Task
Lets write a program in the IDE which performs the following

The 1st line of input contains t - the count of testcases
Each testcase consists of the following 2 lines of input
The 1st line of the testcase contains 2 integers - accept them as variables a and b
The 2nd line of the testcase contains 1 string - accept it as a variable s
For each test case, output on one line the 2 integers followed by the string
Sample 1:
Input
Output
2
1 2
abcde
34 567
A1B2C3
1 2 abcde
34 567 A1B2C3
Explanation:
Test case 1:
1 2
abcde

Output for test case 1: 1 2 abcde

Test case 2:
34 567
A1B2C3

Output for test case 2: 34 567 A1B2C3

OUTPUT:-
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
            // accept 2 integers on the 1st line of each test case
            int a = read.nextInt();
            int b = read.nextInt();
            
            // accept 1 string on the 2nd line of each test case
            String s = read.next();
            
            // output the 2 integers and 1 string on a single line for each test case
            System.out.println(a + " " + b + " " + s);
        }
	}
}
