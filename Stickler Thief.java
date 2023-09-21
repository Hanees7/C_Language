Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. ith house has a[i] amount of money present in it.

Example 1:

Input:
n = 5
a[] = {6,5,5,7,4}
Output: 
15
Explanation: 
Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.
Example 2:

Input:
n = 3
a[] = {1,5,3}
Output: 
5
Explanation: 
Loot only 2nd house and get maximum amount of 5.
Your Task:
Complete the functionFindMaxSum() which takes an array arr[] and n as input which returns the maximum money he can get following the rules.

Expected Time Complexity:O(N).
Expected Space Complexity:O(N).

Constraints:
1 ≤ n ≤ 105
1 ≤ a[i] ≤ 104
CODE:

class Solution
{
    public int FindMaxSum(int arr[], int n)
    {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return maximizeLoot(arr,n-1,dp);
    }
    
    int maximizeLoot(int arr[],int i, int dp[]){
        if(i<0) return 0;
        
        if(dp[i] == -1){
            int pick= arr[i] + maximizeLoot(arr,i-2,dp);
            int notpick = maximizeLoot(arr,i-1,dp);
            return dp[i] = Math.max(pick,notpick);
        }
        return dp[i];
    }
    
}
