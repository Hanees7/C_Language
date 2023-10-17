Given a directed graph, determine whether a vertex j is reachable from another vertex i for all vertex pairs (i, j) in the given graph. Here, vertex j is reachable from another vertex i means that there is a path from vertex i to j. The reachability matrix is called the transitive closure of a graph. The directed graph is represented by an adjacency matrix where there are N vertices. 

Example 1:

Input: N = 4
graph = {{1, 1, 0, 1}, 
         {0, 1, 1, 0}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Output: {{1, 1, 1, 1}, 
         {0, 1, 1, 1}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Explanation: 
The output list shows the reachable indexes.
Example 2:

Input: N = 3
graph = {{1, 0, 0}, 
         {0, 1, 0}, 
         {0, 0, 1}}
Output: {{1, 0, 0}, 
         {0, 1, 0}, 
         {0, 0, 1}}
Explanation: 
The output list shows the reachable indexes.
Your Task:
You do not need to read input or print anything. Your task is to complete the function transitiveClosure() which takes an integer N and a 2D array graph(adjacency matrix of the graph) as input parameters and returns the transitive closure of the graph in the form of 2D array.

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(N2)
CODE:

class Solution{

    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int grid[][])
    {
		for(int k=0;k<grid.length;k++) {
			for(int i=0;i<grid.length;i++) {
				for(int j=0;j<grid.length;j++) {
					if(i == j) {
						grid[i][j] = 1;
					}
					if((grid[i][k]==1 && grid[k][j]==1) && grid[i][j] == 0) {
						grid[i][j] = 1;
					}
				}
			}
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> list ;
		for(int i=0;i<grid.length;i++) {
			list = new ArrayList<>();
			for(int j=0;j<grid[0].length;j++) {
				list.add(grid[i][j]);
			}
			ans.add(list);
		}
		return ans;
    }
}
