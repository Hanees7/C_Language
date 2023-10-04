Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
Your Task:
Complete the function romanToDecimal() which takes a string as input parameter and returns the equivalent decimal number. 

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=roman no range<=3999


CODE:

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int count = 0;
        int n = str.length();
        if (n == 1){
            return (hm.get(str.charAt(0)));
        }else{
            for (int i = 0; i < n-1 ; i++){
                if (hm.get(str.charAt(i)) >= hm.get(str.charAt(i+1))){
                    count+=hm.get(str.charAt(i));
                }
                else {
                    count-=hm.get(str.charAt(i));
                }
            }
        }
        return (count+hm.get(str.charAt(n-1)));
    }
}
