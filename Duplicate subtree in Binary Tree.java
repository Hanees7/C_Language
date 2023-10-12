Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.

Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one. 

Example 1 :

Input : 
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5
Output : 1
Explanation : 
    2     
  /   \    
 4     5
is the duplicate sub-tree.
Example 2 :

Input : 
               1
             /   \ 
           2       3
Output: 0
Explanation: There is no duplicate sub-tree 
in the given binary tree.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function dupSub() which takes root of the tree as the only argument and returns 1 if the binary tree contains a duplicate sub-tree of size two or more, else 0.

Expected Time Complexity: O(N)
Expected Space Complexity: O(N)

Constraints:
0 ≤ Data of nodes ≤ 9
1 ≤ Number of nodes ≤ 105 
CODE:

class Solution {
    
    HashMap<String, Integer> map;
    int dupSub(Node root) {
        map = new HashMap<>();
        dfs(root);
        
        for (Map.Entry<String, Integer> set : map.entrySet()) {
             if(set.getValue() > 1) return 1;
        }
        
        return 0;
    }
    
    String dfs(Node node){
        if(node == null) return "$";
        
        String l = dfs(node.left);
        String r = dfs(node.right);
        
        String s =  l + "-" + node.data + "-" + r;
        
        // count subtree having size greater than one
        if(node.left != null && node.right != null){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        return s;
    }
}
