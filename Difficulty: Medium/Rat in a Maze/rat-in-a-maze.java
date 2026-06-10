class Solution {
    void f(int i,int j,StringBuilder s,int[][] grid,int[][] vis,ArrayList<String> ans){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || vis[i][j]==1)
        return;
        if(i==grid.length-1 && j==grid[0].length-1){
            ans.add(s.toString());
            return;
        }
        
        //down
        vis[i][j]=1;
        s.append('D');
        f(i+1,j,s,grid,vis,ans);
        s.deleteCharAt(s.length()-1);//backtracking
        
        //left
        s.append('L');
        f(i,j-1,s,grid,vis,ans);
        s.deleteCharAt(s.length()-1);//backtracking
        
        //right
        s.append('R');
        f(i,j+1,s,grid,vis,ans);
        s.deleteCharAt(s.length()-1);//backtracking
        
        //up
        s.append('U');
        f(i-1,j,s,grid,vis,ans);
        s.deleteCharAt(s.length()-1);//backtracking
        
        vis[i][j]=0;//backtracking
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        int[][] vis =new int[n][n];
        StringBuilder s= new StringBuilder("");
        ArrayList<String> ans = new ArrayList<>();
        f(0,0,s,maze,vis,ans);
        return ans;
        
    }
}