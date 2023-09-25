Given two integer array A and B of size N each.
A sum combination is made by adding one element from array A and another element of array B.
Return the maximum K valid sum combinations from all the possible sum combinations.

Note : Output array must be sorted in non-increasing order.

Example 1:

Input:
N = 2
K = 2
A [ ] = {3, 2}
B [ ] = {1, 4}
Output: {7, 6}
Explanation: 
7 -> (A : 3) + (B : 4)
6 -> (A : 2) + (B : 4)
Example 2:

Input:
N = 4
K = 3
A [ ] = {1, 4, 2, 3}
B [ ] = {2, 5, 1, 6}
Output: {10, 9, 9}
Explanation: 
10 -> (A : 4) + (B : 6)
9 -> (A : 4) + (B : 5)
9 -> (A : 3) + (B : 6)
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxCombinations() which takes the interger N,integer K and two integer arrays A [ ] and B [ ] as parameters and returns the maximum K valid distinct sum combinations .

Expected Time Complexity: O(Nlog(N))
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤  105
1 ≤ K ≤  N
1 ≤ A [ i ] , B [ i ] ≤ 104
CODE:

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        Arrays.sort(A);
        Arrays.sort(B);
        PriorityQueue<Node> heap = new PriorityQueue<>();
        Node root=new Node(A[N-1]+B[N-1], N-1, N-1);
        heap.add(root);
        List<Integer> ans = new ArrayList<>();
        Set<Node> visited = new HashSet<>();
        visited.add(root);
        while(K-->0){
            // System.out.println(heap);
            Node curr = heap.poll();
            ans.add(curr.sum);
            if(curr.i>0){
                Node next = new Node(A[curr.i-1]+B[curr.j],curr.i-1,curr.j);
                if(visited.add(next))
                    heap.add(next);
            }
                
            if(curr.j>0){
                Node next = new Node(A[curr.i]+B[curr.j-1],curr.i,curr.j-1);
                if(visited.add(next))
                    heap.add(next);
            }
                
        }
        return ans;
        
    }
}
class Node implements Comparable<Node>{
    public int sum;
    int i,j;
    Node(int sum, int i, int j){
        this.sum = sum;
        this.i=i;
        this.j=j;
    }
    public int compareTo(Node other){
        return other.sum-this.sum;
    }
    public String toString(){
        return String.format("(%d, %d, %d)", sum, i, j);
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null ||  this.getClass() != o.getClass())
            return false;
        Node node = (Node) o;
        return node.sum==this.sum && node.i==this.i && node.j==this.j;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(sum, i, j);
    }
}
