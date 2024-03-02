You are given 2 integers - 
�
A and 
�
C.
You need to find if there exists any 
�
�
�
�
�
�
�
integer 
�
B which meets the following condition

�
B must be an integer
�
B is the average of 
�
A and 
�
C.
Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of two space-separated integers 
�
A and 
�
C, the given integers.
Output Format
For each test case, output 
−
1
−1 if there exists no integer 
�
B such that 
�
,
�
,
A,B, and 
�
C are in arithmetic progression. Else, output the value of 
�
B.

Sample 1:
Input
Output
3
3 5
6 6
2 7
4
6
-1
Explanation:
Test case 
1
1: Considering 
�
=
4
B=4, 
�
B is the average of 
3
3 and 
5
5.
Test case 
2
2: Considering 
�
=
6
B=6, 
�
B is the average of 
6
6 and 
6
6.
Test case 
3
3: There exists no integer 
�
B such that 
�
B can be the average of 
2
2 and 
7
7.
  OUTPUT :
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int A = read.nextInt();
	        int C = read.nextInt();
	        // Use your sub-components below this line to solve the problem
if((A+C)%2 == 0){
    int B = (A+C)/2;
    System.out.println(B);
}
else{
    System.out.println(-1);
}
	        
	    }
	}
}
