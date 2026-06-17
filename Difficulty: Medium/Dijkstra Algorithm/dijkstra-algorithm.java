class Pair{
    int node;
    int wt;
    Pair(int node,int wt){
        this.node=node;
        this.wt=wt;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        //adjacency list
        ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u=edge[0],v=edge[1],w=edge[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        int [] dist = new int[V];
        Arrays.fill(dist,(int)1e9);
        //bfs traversal
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->a.wt-b.wt);
        q.offer(new Pair(src,0));
        dist[src]=0;
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int node = temp.node;
            int wt=temp.wt;
            for(Pair p:adj.get(node)){
                int a=p.node;
                int edw=p.wt;
                if(wt+edw<dist[a]){
                    dist[a]=wt+edw;
                    q.offer(new Pair(a,dist[a]));
                }
            }
        }
        return dist;
    }
}