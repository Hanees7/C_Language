Given a string S. The task is to find all permutations (need not be different) of a given string.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.
Example 2:

Input:
S = ABSG
Output: ABGS ABSG AGBS AGSB ASBG ASGB
BAGS BASG BGAS BGSA BSAG BSGA GABS
GASB GBAS GBSA GSAB GSBA SABG SAGB
SBAG SBGA SGAB SGBA
Explanation: There are total 24 permutations, as given in the output.
Your Task:
This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

Constraints:
1 ≤ size of string ≤ 5

Expected Time Complexity: O(N * N!), N = length of string.
Expected Auxiliary Space: O(1)


CODE:

class Solution
{
    
    public ArrayList<String> permutation(String S)
    {
       ArrayList<String> al = new ArrayList<String>();
       int index = 0;
        Permutation(S,al,index);
        Collections.sort(al);
        return al;
    }
     
     
     void Permutation(String s, ArrayList<String> al, int index){
         
         
         if(index >= s.length()){
             al.add(s);
             return;
         }
         
         for(int j =index;j<s.length();j++){
             
             s = swap(s,index,j);
             Permutation(s, al, index + 1);
             s = swap(s, index, j);
             
         }
         
         
     }  
     
     public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

