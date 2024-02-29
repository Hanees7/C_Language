In Chefland, a tax of rupees 
10
10 is deducted if the total income is strictly greater than rupees 
100
100.
Given that total income is 
�
X rupees, find out how much money does the Chef take home.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
The first and only line of each test case contains a single integer 
�
X — Chef's total income.
Output Format
For each test case, output on a new line, the amount of money that Chef takes home after deducting tax.

Sample 1:
Input
Output
2
101
100
91
100
Explanation:
Test case 
1
1: Your total income is 
101
101 rupees which is greater than 
100
100 rupees. Thus, a tax of 
10
10 rupees would be deducted and you get 
101
−
10
=
91
101−10=91 rupees.

Test case 
2
2: Your total income is 
100
100 rupees which is equal to 
100
100 rupees. Thus, no tax would be deducted and you get 
100
100 rupees.

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
    		int x = read.nextInt();
    		// Update your code below this line solve the problem
    		if(x > 100){
    		    x-=10;
    		    System.out.println(x);
    		}
    		else{
    		    System.out.println(x);
    		}
		}
	}
}
