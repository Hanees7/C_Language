Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Example 1:

Input:
N = 4
mat[][] = {{1, 1, 1, 1},
           {2, 2, 2, 2}
           {3, 3, 3, 3}
           {4, 4, 4, 4}}
Output: 
{{1, 2, 3, 4},  
 {1, 2, 3, 4}  
 {1, 2, 3, 4}
 {1, 2, 3, 4}} 
Example 2:

Input:
N = 2
mat[][] = {{1, 2},
           {-9, -2}}
Output:
{{1, -9}, 
 {2, -2}}

Your Task:
You dont need to read input or print anything. Complete the function transpose() which takes matrix[][] and N as input parameter and finds the transpose of the input matrix. You need to do this in-place. That is you need to update the original matrix with the transpose. 

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 103
-109 <= mat[i][j] <= 109


  CODE:-

  class Solution
{
    public void transpose(int n,int a[][])
    {
        int fix=0;
        for(int k=0;k<n;k++)
        {
            for(int i=k,j=k;i<n-1;i++,j++)
            {
                swap1(a,i+1,j+1,fix);
            }
            fix++;
        }
        
    }
    public static void swap1(int arr[][],int row,int col,int fix)
    {
        int temp = arr[col][fix];
        arr[col][fix] = arr[fix][row];
        arr[fix][row] = temp;
    }
}
