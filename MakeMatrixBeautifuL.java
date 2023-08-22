A beautiful matrix is a matrix in which the sum of elements in each row and column is equal. Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value of any one cell by 1.
Example 1:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
4
Explanation:
Updated matrix:
4 3
3 4
1. Increment value of cell(0, 0) by 3
2. Increment value of cell(0, 1) by 1
Hence total 4 operation are required.
Example 2:

Input:
N = 3
matrix[][] = {{1, 2, 3},
              {4, 2, 3},
              {3, 2, 1}}
Output: 
6
Explanation:
Number of operations applied on each cell are as follows:
1 2 0
0 0 0
0 1 2
Such that all rows and columns have sum of 9.

CODE:

class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int n = matrix.length;
        int[] rsum = new int[n];
        int[] csum = new int[n];
        int maxi=0;
        int count=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rsum[i] += matrix[i][j];
                csum[j] += matrix[i][j];
            }
            maxi = Math.max(maxi, rsum[i]);
        }
        
        for(int j=0; j<n; j++){
            maxi = Math.max(maxi, csum[j]);
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(rsum[i]>csum[j]){
                    int temp = maxi - rsum[i];
                    count += temp;
                    rsum[i] += temp;
                    csum[j] += temp;
                }
                else{
                    int temp = maxi - csum[j];
                    count += temp;
                    rsum[i] += temp;
                    csum[j] += temp;
                }
            }
        }
        
        return count;
    }
}
