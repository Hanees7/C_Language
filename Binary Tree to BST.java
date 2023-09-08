Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.
 Example 1:

Input:
      1
    /   \
   2     3
Output: 
1 2 3
Explanation:
The converted BST will be 
      2
    /   \
   1     3

Example 2:

Input:
          1
       /    \
     2       3
   /        
 4       
Output: 
1 2 3 4
Explanation:
The converted BST will be

        3
      /   \
    2     4
  /
 1
Your Task:
You don't need to read input or print anything. Your task is to complete the function binaryTreeToBST() which takes the root of the Binary tree as input and returns the root of the BST. The driver code will print inorder traversal of the converted BST.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
CODE:

class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> ans = new ArrayList<>();
       
       inorder(ans, root);
       
       Node newRoot = null;
      for(Integer i : ans){
            newRoot = insert(newRoot, i);
      }
       return newRoot;
    }
    
    static Node insert(Node node, int val){
        if(node == null)
            return new Node(val);
            
        if(node.data < val)
            node.right = insert(node.right, val);
            
        else if(node.data > val)
            node.left = insert(node.left, val);
        
        return node;
    }
    
    static void inorder(ArrayList<Integer> ans, Node root){
        if(root == null)
            return;
        
        inorder(ans, root.left);
        ans.add(root.data);
        inorder(ans, root.right);
        
    }
}
 
