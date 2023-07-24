Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2
Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60
Your Task:
Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
0 ≤ Data of a node ≤ 105

CODE:-

  class Solution{
    //Function to return list containing elements of right view of binary tree.
    int taken = 0;
    void help(Node node, int cur, ArrayList<Integer> ans) {
        if(node == null) return;
        if(taken < cur) {
            ans.add(node.data);
            taken++;
        }
        cur++;
        help(node.right, cur, ans);
        help(node.left, cur, ans);
        
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        
        ArrayList<Integer> ans = new ArrayList<>();
        int cur =1;
        help(node, cur, ans);
        return ans;
    }
}
