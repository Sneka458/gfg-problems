class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        int n=adj.size();
        int[] vis=new int[n];
        q.offer(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int a:adj.get(node)){
                if(vis[a]==0){
                    q.offer(a);
                    vis[a]=1;
                }
            }
        }
        return ans;
    }
}