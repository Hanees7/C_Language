You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

Example 1:

Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5
Explanation:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5
Example 2:

Input:
n = 3, m = 4
matrrix[][] = {{12, 11, 10, 9},
         {8, 7, 6, 5},
         {4, 3, 2, 1}}
Output: 12 11 10 9 5 1 2 3 4 8
Your Task:
Complete the function boundaryTraversal() that takes matrix, n and m as input parameters and returns the list of integers that form the boundary traversal of the matrix in a clockwise manner.

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(N+M)

Constraints:
1 <= n, m<= 1000
0 <= matrixi <= 1000
CODE:

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer>s=new ArrayList<Integer>();
        int i=0;
        for(int k=0;k<m;k++)
        s.add(matrix[0][k]);
        i++;
        if(i==n)
        return s;
        Stack<Integer>stack=new Stack<>();
        while(i<n-1)
        {
            s.add(matrix[i][m-1]);
            stack.push(matrix[i][0]);
            i++;
        }
        for(int l=m-1;l>=0;l--)
        s.add(matrix[n-1][l]);
        if(m!=1)
        {
            while(!stack.isEmpty())
            s.add(stack.pop());
        }
        return s;
    }
}
