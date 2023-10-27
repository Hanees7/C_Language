Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
Note: The order of characters in the string should be maintained.

Example 1:

Input: 
S = "aebcbda"
Output: 
2
Explanation: 
Remove characters 'e' and 'd'.
Example 2:

Input: 
S = "geeksforgeeks"
Output: 
8
Explanation: 
One of the possible result string can be "eefee", so answer is 13 - 5 = 8.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function minimumNumberOfDeletions() which takes the string S as inputs and returns the minimum number of deletions required to convert S into a pallindrome.

Expected Time Complexity: O(|S|2)
Expected Auxiliary Space: O(|S|2)

Constraints:
1 ≤ |S| ≤ 103
CODE:

class Solution{
    static int minimumNumberOfDeletions(String S) {
      
        //code here
        Integer [][] dp = new Integer[S.length()][S.length()];
        return S.length() - lps(S,0,S.length() - 1, dp);
    }
    public static int lps(String s , int start, int end, Integer [][] dp)
    {
        if(start > end)
        return 0;
        if(start == end)
        return 1;
        if(dp[start][end] == null)
        {
        if(s.charAt(start) == s.charAt(end))
        dp[start][end] = 2 + lps(s,start + 1, end - 1,dp);
        else
        dp[start][end] = Math.max(lps(s,start + 1, end,dp) , lps(s,start, end - 1,dp));
        }
        return dp[start][end];
    }
}
