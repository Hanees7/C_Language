Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers.

Example 1:

Input:
s1 = "0033"
s2 = "2"
Output:
66
Example 2:

Input:
s1 = "11"
s2 = "23"
Output:
253
Your Task: You don't need to read input or print anything. Your task is to complete the function multiplyStrings() which takes two strings s1 and s2 as input and returns their product as a string.

Expected Time Complexity: O(n1* n2)
Expected Auxiliary Space: O(n1 + n2); where n1 and n2 are sizes of strings s1 and s2 respectively.

Constraints:
1 ≤ length of s1 and s2 ≤ 103
CODE:

class Solution{
  public:
    /*You are required to complete below function */
    string multiplyStrings(string s1, string s2) {
       
       reverse(s1.begin(), s1.end());
       reverse(s2.begin(), s2.end());
       
       bool isNeg1 = 0, isNeg2 = 0;
       
       if(s1.back() == '-') {
           s1.pop_back();
           isNeg1 = 1;
       }
       
       if(s2.back() == '-') {
           s2.pop_back();
           isNeg2 = 1;
       }
       
       while(s1.back() == '0') {
           s1.pop_back();
       }
       
       while(s2.back() == '0') {
           s2.pop_back();
       }
       
       int len1 = s1.size();
       int len2 = s2.size();
       
       string out(len1 + len2, '0');
       for(int i=0; i<len2; i++) {
           int carry = 0, j;
           
           for(j = 0; j<len1; j++) {
               
               int mul = (s2[i] - '0') * (s1[j] - '0') + (out[i+j] - '0') + carry;
               out[i+j] = (char)('0' + mul%10);
               carry = mul/10;
           }
           
           while(carry) {
               int mul = (out[i+j] - '0') + carry;
               out[i+j] = (char)('0'+mul%10);
               carry = mul/10;
               ++j;
           }
       }
       
       while(out.back() == '0') {
           out.pop_back();
       }
       
       if(!out.size()) {
           return "0";
       }
       
       if(isNeg1 ^ isNeg2) {
           out += '-';
       }
       
       reverse(out.begin(), out.end());
       return out;
    }
};

static const int _ = [](){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    return 0;
}();
