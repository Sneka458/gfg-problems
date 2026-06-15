class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    boolean[] visited;
    void f(int node, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        ans.add(node);
        for (int a : adj.get(node)) {
            if (!visited[a]) {
                f(a, adj);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        visited = new boolean[V];
        f(0, adj);   // Start DFS from vertex 0
        return ans;
    }
}