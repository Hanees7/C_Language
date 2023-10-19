Given an integer X and an undirected acyclic graph with V nodes, labeled from 0 to V-1, and E edges, find the level of node labeled as X.

Level is the minimum number of edges you must travel from the node 0 to some target.

If there doesn't exists such a node that is labeled as X, return -1.

Example 1:

Input:

X = 4
Output:
2
Explanation:

We can clearly see that Node 4 lies at Level 2.
Example 2:

Input:

X = 1
Output:
1
Explanation:
Node 1 lies at level 1, immediate after Node 0.
Your task:
You dont need to read input or print anything. Your task is to complete the function nodeLevel() which takes two integers V and X denoting the number of vertices and the node, and another adjacency list adj as input parameters and returns the level of Node X. If node X isn't present it returns -1.

Expected Time Complexity: O(V)
Expected Auxiliary Space: O(V)

Constraints:
2 ≤ V ≤ 104
1 ≤ E ≤ 104
0 ≤ adji, j < V
1 ≤ X < V
Graph doesn't contain multiple edges and self loops.
CODE:

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[V];
        
        q.add(0);
        int c =0;
        
        while(!q.isEmpty()){
            int n=q.size();
           for(int i=0;i<n;i++){
               int node=q.poll();
               vis[node]=1;
               if(node==X)
               return c;
           for(int adjv:adj.get(node)){
              if(vis[adjv]==0){
              q.add(adjv);
               }
             }
           }
           c++;
        }
        return -1;
    }
}
