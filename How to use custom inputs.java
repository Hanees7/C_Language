You are given a program which does the following

Accepts the count of test cases - t - in the 1st line.
First line of each test case consists of an integer N
Outputs the integer which is greater than N by 1
Note: The Sample 1 input values are pre-populated in the Custom inputs below the IDE
Task
You need to do the following

Replace the Custom inputs with Sample test case 2 and click Run to check the result.
You can click the Copy icon at the top-right of the sample testcases to copy easily.
Replace the Custom inputs with your own created inputs and click Run to check the result.
You can experiment a few more options.
Once done, click on Submit to test your code against the Private test files
Note - Do not forget that the 1st integer in the custom inputs has to be t - the number of test cases
Sample 1:
Input
Output
3
1
2
3
2
3
4
Sample 2:
Input
Output
3
100
200
300
101
201
301
OUTPUT :
// Change the 'custom inputs' below and click 'run'
// Click on 'Submit' once you have tried out to proceed to the next problem

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            System.out.println(n+1);
        }
	}
}
