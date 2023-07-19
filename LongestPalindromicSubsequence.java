Given a String, find the longest palindromic subsequence.

Example 1:

Input:
S = "bbabcbcab"
Output: 7
Explanation: Subsequence "babcbab" is the
longest subsequence which is also a palindrome.
Example 2:

Input: 
S = "abcd"
Output: 1
Explanation: "a", "b", "c" and "d" are
palindromic and all have a length 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestPalinSubseq() which takes the string S as input and returns an integer denoting the length of the longest palindromic subsequence of S.

Expected Time Complexity: O(|S|*|S|).
Expected Auxiliary Space: O(|S|*|S|).

Constraints:
1 ≤ |S| ≤ 1000

  CODE:-

  class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
          int n = S.length();
        int dp[][] = new int[n][n];


        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 1;

                } else if (g == 1) {
                   dp[i][j] = S.charAt(i)==S.charAt(j)? 2:1;
                }
                else{
                    if(S.charAt(i)==S.charAt(j))
                    {
                        dp[i][j] = 2 +  dp[i+1][j-1];
                    }
                    else{
                        dp[i][j] =  Math.max(dp[i+1][j], dp[i][j-1]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
