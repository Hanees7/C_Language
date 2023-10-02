Given a string consisting of lower case English alphabets, the task is to find the number of distinct subsequences of the string
Note: Answer can be very large, so, ouput will be answer modulo 109+7.

Example 1:

Input: 
s = "gfg"
Output: 
7
Explanation: 
The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" .
Example 2:

Input: 
s = "ggg"
Output: 
4
Explanation: 
The four distinct subsequences are "", "g", "gg", "ggg".
Your task:
You do not need to read any input or print anything. The task is to complete the function distinctSubsequences(), which takes a string as input and returns an integer.

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |s| ≤ 105
s contains lower case English alphabets
CODE:

class Solution {
    int mod = 1000000007;
    int distinctSubsequences(String S) {
        // code here
         int ans = 1;
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (mp.containsKey(c)) {
                int temp = ans;
                ans = ((ans * 2) % mod - mp.get(c) + mod) % mod;
                mp.put(c, temp);
            } else {
                mp.put(c, ans);
                ans = (ans * 2) % mod;
            }
        }

        return ans;
    }
}
