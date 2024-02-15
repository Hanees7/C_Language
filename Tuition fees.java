Practice problem - Tuition fees
Let's solve this practice problem.

You will attend tuitions for 
�
X weeks, and the cost of tuition per week is 
�
Y dollars.
You need to compute and output your total tuition fees.

Hint

Refer to the multiplication syntax you learnt in the previous questions
Run your code on the sample test cases before submitting the same
Input Format
The first line of input will contain an integer 
�
T — the number of test cases.
The first and only line of each test case contains two space-separated integers 
�
X and 
�
Y
Output Format
For each test case, output on a new line your total tuition fees.
Sample 1:
Input
Output
4
1 10
1 15
2 10
2 15
10
15
20
30

OUTPUT :
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept 2 integers inputs
        	int x = read.nextInt();
        	int y = read.nextInt();
        	
            // Update your code below this line to solve the problem
        System.out.println(x*y);
		}
	}
}
