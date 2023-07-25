Given a binary tree and the task is to find the spiral order traversal of the tree.

Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

For below tree, function should return 1, 2, 3, 4, 5, 6, 7.


 
 

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 
Your Task:
The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 105

  CODE:-

  class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
         ArrayList<Integer> res=new ArrayList<>();
        boolean flag=true;
        Queue<Node > q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
             ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node r=q.remove();
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
                if(flag==true){
                    al.add(0,r.data);
                }
                else{
                    al.add(r.data);
                    
                }
            } 
            flag=!flag;
            for(int i=0;i<al.size();i++){
                res.add(al.get(i));
            }
        }
        return res;
    }
}
