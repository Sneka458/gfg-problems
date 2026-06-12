/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
 class Pair{
        Node node;
        int line;
        Pair(Node node,int line){
            this.node=node;
            this.line=line;
        }
    }
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        q.offer(new Pair(root,0));
        int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair ele = q.poll();
            Node node =ele.node;
            int l=ele.line;
            mn=Math.min(mn,l);
            mx=Math.max(mx,l);
            if(!mp.containsKey(l)){
                mp.put(l,node.data);
            }
            if(node.left!=null){
                q.offer(new Pair(node.left,l-1));
            }
            if(node.right!=null){
                q.offer(new Pair(node.right,l+1));
            }
            
        }
        for(int i=mn;i<=mx;i++){
            ans.add(mp.get(i));
        }
        return ans;
    }
}