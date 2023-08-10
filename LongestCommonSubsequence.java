Given two strings, find the length of longest subsequence present in both of them. Both the strings are in uppercase latin alphabets.

Example 1:

Input:
A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR
Output: 3
Explanation: LCS for input strings “ABCDGH” and “AEDFHR” is “ADH” of length 3.
Example 2:

Input:
A = 3, B = 2
str1 = ABC
str2 = AC
Output: 2
Explanation: LCS of "ABC" and "AC" is "AC" of length 2.
Your Task:
Complete the function lcs() which takes the length of two strings respectively and two strings as input parameters and returns the length of the longest subsequence present in both of them.

Expected Time Complexity : O(|str1|*|str2|)
Expected Auxiliary Space: O(|str1|*|str2|)

Constraints:
1<=size(str1),size(str2)<=103
CODE:

class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int arr[][] = new int[x+1][y+1];
        for(int i=x; i>=0;i--){
            for(int j=y; j>=0; j--){
                if(i==x|| j==y){
                    arr[i][j]=0;
                }
                else if(s1.charAt(i)==s2.charAt(j)){
                    arr[i][j]= 1 + arr[i+1][j+1];
                }
                else if(s1.charAt(i)!=s2.charAt(j)){
                    arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
                }
            }
        }
        return arr[0][0];
    }
    
}
