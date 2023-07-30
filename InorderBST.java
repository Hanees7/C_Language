Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.
 

Example 1:

Input:
      2
    /   \
   1     3
K(data of x) = 2
Output: 3 
Explanation: 
Inorder traversal : 1 2 3 
Hence, inorder successor of 2 is 3.


CODE:

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public Node inorderSuccessor(Node root,Node x)
         {
          Node successor = null;
          
          while(root!=null){
              if(x.data>=root.data){
                  root = root.right;
              }else{
                  successor = root;
                  root = root.left;
              }
          }
          
          return successor;
         }
}
